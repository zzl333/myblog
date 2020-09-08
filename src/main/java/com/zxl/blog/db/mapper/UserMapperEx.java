package com.zxl.blog.db.mapper;

import com.zxl.blog.db.entities.User;
import com.zxl.blog.db.mapper.base.UserMapper;
import com.zxl.blog.db.pojo.UserDetail;
import org.apache.ibatis.annotations.Param;

public interface UserMapperEx extends UserMapper {

    UserDetail selectUserDetail(@Param("account") String account);

    User selectByAccount(@Param("account") String account);
}
