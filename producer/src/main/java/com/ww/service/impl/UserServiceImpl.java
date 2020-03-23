package com.ww.service.impl;

import com.ww.dao.UserMapper;
import com.ww.model.UserDO;
import com.ww.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ww
 * @date 2020-02-15
 */
@Service("feignService")
public class UserServiceImpl implements UserService{

    @Autowired(required=false)
    private UserMapper userMapper;

    @Override
    public List<UserDO> getList() {

        List<UserDO> listUser = userMapper.getList();
        return listUser;
    }

    @Override
    public UserDO getFeignList() {
        UserDO result =  userMapper.sayFeign();
        return result;
    }

    @Override
    public void getcc(String ... cc) {

    }
}
