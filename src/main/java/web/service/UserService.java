package web.service;

import web.entity.User;

public interface UserService {
    User selectUserById(Integer userId);
}
