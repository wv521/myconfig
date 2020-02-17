package com.ww.controller;

import com.ww.model.UserDO;
import com.ww.servcie.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class FeignController {

@Autowired
private FeignService feignService;

    @RequestMapping(value="getFeignList")
    public UserDO getFeignList(){
        UserDO result =feignService.getFeignList();
        return result;
    }
}
