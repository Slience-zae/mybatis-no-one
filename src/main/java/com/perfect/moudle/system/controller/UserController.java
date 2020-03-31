package com.perfect.moudle.system.controller;

import com.perfect.common.utils.ResultUtil;
import com.perfect.common.vo.Result;
import com.perfect.moudle.system.entity.User;
import com.perfect.moudle.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 保存/更新用户
     * @param user
     * @return
     */
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public Result saveUser(@RequestBody User user){
        ResultUtil resultUtil = new ResultUtil();
        userService.saveUser(user);
        return resultUtil.setSuccessMsg("保存成功");
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @RequestMapping(value = "/del",method = RequestMethod.GET)
    public Result delUser(@RequestParam(value = "id") String id){
        boolean isOk = userService.deleteUser(id);
        if (isOk){
            return new ResultUtil<>().setSuccessMsg("删除成功");
        }else {
            return new ResultUtil<>().setErrorMsg("删除失败，请检查代码");
        }
    }

    /**
     * 获取所有的用户列表
     * @return
     */
    @RequestMapping(value = "/findUserList",method = RequestMethod.GET)
    public Result findUserList(){
        return new ResultUtil<>().setData(userService.selectUserList());
    }

    /**
     * 根据id 获取用户信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/findById",method = RequestMethod.GET)
    public Result findById(@RequestParam String id){
        return new ResultUtil<>().setData(userService.selectById(id));
    }
}
