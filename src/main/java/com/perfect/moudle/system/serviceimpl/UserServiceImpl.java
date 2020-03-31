package com.perfect.moudle.system.serviceimpl;

import com.perfect.common.utils.IdWorker;
import com.perfect.moudle.system.dao.UserMapper;
import com.perfect.moudle.system.entity.User;
import com.perfect.moudle.system.entity.UserExample;
import com.perfect.moudle.system.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void saveUser(User user) {
        if(user.getId()!=null && !"".equals(user.getId())){//更新
            userMapper.updateByPrimaryKey(user);
        }else{//保存
            User newUser = new User();
            //将对象赋值给新对象
            BeanUtils.copyProperties(user, newUser,"id","create_time"
                    ,"create_by","update_time","update_by","del_flag");
            userMapper.insertSelective(newUser);
        }
    }

    @Override
    public boolean deleteUser(String id) {
        User user = userMapper.selectByPrimaryKey(id);
        user.setDel_flag(1);
        int count = userMapper.updateByPrimaryKey(user);
        if(count!=0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public User selectById(String id){
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> selectUserList() {
        return userMapper.selectByExample(null);
    }

    @Override
    public List<User> selectUserLikeName(String name) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andNameLike(name);
        return userMapper.selectByExample(userExample);
    }
}
