package com.ww.service;


import com.ww.model.UserDO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="zuul-server")
public interface FeignService {

    @RequestMapping(value="/api/producer/getFeignList",method = RequestMethod.GET)
    UserDO getFeignList();

}
