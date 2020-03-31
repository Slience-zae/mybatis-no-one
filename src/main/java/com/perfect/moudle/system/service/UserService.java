package com.perfect.moudle.system.service;

import com.perfect.moudle.system.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 保存/更新用户
     * @param user
     */
    void saveUser(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    boolean deleteUser(String id);

    /**
     * 根据id查询用户的详情
     * @param id
     * @return
     */
    User selectById(String id);

    /**
     * 获取用户列表
     * @return
     */
    List<User> selectUserList();

    /**
     * 根据用户名模糊查询
     * @param name
     * @return
     */
    List<User> selectUserLikeName(String name);
}
