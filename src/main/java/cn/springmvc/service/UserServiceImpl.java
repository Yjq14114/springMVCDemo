package cn.springmvc.service;

import cn.springmvc.dao.UserMapper;
import cn.springmvc.model.User;
import cn.springmvc.service.impl.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 */
@Service("userService")
public class UserServiceImpl implements IUserService{
    @Resource
    private UserMapper userMapper;

    public User getUserById(int userId) {
        return this.userMapper.selectByPrimaryKey(userId);
    }

    public List<User> userList() {
        return null;
    }
}
