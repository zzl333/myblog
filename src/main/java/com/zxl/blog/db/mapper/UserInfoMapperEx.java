package com.zxl.blog.db.mapper;

import com.zxl.blog.db.entities.UserInfo;
import com.zxl.blog.db.mapper.base.UserInfoMapper;
import org.apache.ibatis.annotations.Param;

public interface UserInfoMapperEx extends UserInfoMapper {
    UserInfo selectByUid(@Param("uid") Integer uid);
}
