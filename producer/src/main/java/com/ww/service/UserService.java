package com.ww.service;

import com.ww.model.UserDO;
import org.apache.catalina.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author ww
 * @date 2020-02-15
 */
//@FeignClient(value="zuul-server")
public interface UserService {

    List<UserDO> getList();

//    @RequestMapping(value = "getFeignList",method = RequestMethod.GET)
//@RequestMapping(value="/api/producer/getFeignList",method = RequestMethod.GET)
UserDO getFeignList();

    void getcc(String ...cc);
}
