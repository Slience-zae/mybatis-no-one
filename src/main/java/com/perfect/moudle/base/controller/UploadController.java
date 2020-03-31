package com.perfect.moudle.base.controller;

import com.perfect.common.vo.MultipartFiles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping(value = "/")
public class UploadController {

    //单文件上传，参数必须是MultipartFile类型,用来接收上传的文件
    @RequestMapping("uploadFile")
    public String test_upload(MultipartFile multipartFile) throws Exception{
        if(!multipartFile.isEmpty()){
            //文件上传的保存路径
            String path="F:\\old project\\mybatis-no-one\\src\\main\\webapp\\WEB-INF\\file\\";
            //图片的原始名称（不含路径）
            String origanlFileName = multipartFile.getOriginalFilename();
            //上传的图片的保存的新名称，随机生成文件名称+.jpg
            String newFileName = UUID.randomUUID()+origanlFileName.substring(origanlFileName.lastIndexOf("."));
            File file = new File(path+newFileName);
            //将内存的数据写到磁盘上
            multipartFile.transferTo(file);
        }
        return "file/success";
    }

    //多文件上传,MultipartFiles是自定义包装类，用List<MultipartFile>接收
    @RequestMapping("uploadFiles")
    public String test_uploadMoreFile(MultipartFiles multipartFiles) throws Exception{
        List<MultipartFile> list = multipartFiles.getPic(); //得到上传的文件链表
        for(MultipartFile multipartFile:list){
            if(!multipartFile.isEmpty()){
                //上传图片的保存路径
                String path = "F:\\old project\\mybatis-no-one\\src\\main\\webapp\\WEB-INF\\file\\files\\";
                //图片的原始名称（不含路径）
                String origanlFileName = multipartFile.getOriginalFilename();
                //新图片的名称,随机生成文件名称+.jpg
                String newFileName =                     UUID.randomUUID()+origanlFileName.substring(origanlFileName.lastIndexOf("."));
                //新图片
                File file = new File(path+newFileName);
                //将内存中的数据写入磁盘
                multipartFile.transferTo(file);
            }
        }
        return "file/success";
    }

    //请求<a href="/download?filename=19088572-7e11-4a83-aa08-b006327e607f.jpg">点击下载资源</a>
    @RequestMapping("download")
    //String filename 是请求参数
    public String test_download(HttpServletRequest request, HttpServletResponse response, String filename) throws Exception{

        filename = new String(filename.getBytes("iso-8859-1"),"UTF-8");//get提交，修改编码

        String path = request.getRealPath("/WEB-INF/file/files/"+filename);//得到资源在硬盘上的绝对的路径
        File file = new File(path);
        response.setCharacterEncoding("UTF-8");
        filename = URLEncoder.encode(filename, "UTF-8");//将中文转为浏览器可认识的编码
        response.setHeader("content-disposition", "attachment;filename="+filename);//设置响应头为文件下载
        response.setContentLength((int)file.length());
        int len = 0;
        byte []buffer = new byte[1024];
        InputStream is = new FileInputStream(file);
        OutputStream os= response.getOutputStream();//向浏览器写数据
        while((len = is.read(buffer)) != -1){
            os.write(buffer,0,len);
        }
        is.close();
        os.close();
        return null;    //一定要返回null,执行后不跳转
    }
}
