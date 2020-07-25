package com.test.mapper;

import com.test.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User selectUser(long id);
}
