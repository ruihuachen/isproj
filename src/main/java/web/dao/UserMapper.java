package web.dao;

import org.apache.ibatis.annotations.Mapper;
import web.entity.User;

@Mapper
public interface UserMapper {

    User selectUserById(Integer userId);
}
