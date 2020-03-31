package com.perfect.common.vo;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class MultipartFiles {
    private List<MultipartFile> pic;//用List接收,每个文件对应一个MultipartFile

    public List<MultipartFile> getPic() {
        return pic;
    }

    public void setPic(List<MultipartFile> pic) {
        this.pic = pic;
    }
}
