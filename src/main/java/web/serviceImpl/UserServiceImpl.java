package web.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.service.UserService;
import web.dao.UserMapper;
import web.entity.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User selectUserById(Integer userId) {
        return userMapper.selectUserById(userId);
    }
}
