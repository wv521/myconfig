package com.ww.controller;

import com.ww.model.UserDO;
import com.ww.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ww
 * @date 2020-02-15
 */
@RestController
public class UserController {

    @Autowired(required=false)
    private UserService userService;

    @GetMapping(value="getList")
    public List<UserDO> getList(){
        List<UserDO> userList =userService.getList();
        return userList;
    }

//    @GetMapping(value="getFeignList")
//    public UserDO getFeignList(){
//        UserDO result = userService.getFeignList();
//        return  result;
//    }


        public void stez(String cc){
            userService.getcc(cc);
        }

}
