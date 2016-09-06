package cn.springmvc.service.impl;

import cn.springmvc.model.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 */
@Repository
public interface IUserService {
    User getUserById(int userId);
    List<User> userList();
}
