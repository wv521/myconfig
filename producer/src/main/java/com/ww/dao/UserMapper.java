package com.ww.dao;

import com.ww.model.UserDO;
import org.apache.catalina.User;

import java.util.List;

public interface UserMapper {
    List<UserDO> getList();


    UserDO sayFeign();
}
