package web.dubboService.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import web.dao.UserMapper;
import web.dubboService.DubboService;
import web.entity.User;

import java.util.List;


@Service(version = "1.0.0")
public class DubboServiceImpl implements DubboService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> A() {
        return userMapper.findAllUsers();
    }
}
