package cn.springmvc.service;

import cn.springmvc.dao.UserMapper;
import cn.springmvc.model.User;
import cn.springmvc.service.impl.IUserService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 */
@Service("userService")
public class UserServiceImpl implements IUserService{
    @Resource
    private UserMapper userMapper;
   private JdbcTemplate jdbcTemplate;

    public User getUserById(int userId) {
        return this.userMapper.selectByPrimaryKey(userId);
    }

    public List<User> userList(String username) {
        jdbcTemplate.queryForList("select * from user where username = "+username+"");
        return null;
    }

    @Override
    public List<User> getUserByName(String username) {
        return userMapper.selectByName(username);
    }
}
