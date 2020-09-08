package com.zxl.blog.db.mapper;

import com.zxl.blog.db.entities.User;
import com.zxl.blog.db.mapper.base.UserMapper;
import org.apache.ibatis.annotations.Param;

public interface UserMapperEx extends UserMapper {

    User selectByAccount(@Param("account") String account);
}
