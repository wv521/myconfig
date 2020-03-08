package com.ww.controller;

import com.ww.model.UserDO;
import com.ww.servcie.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/")
public class FeignController {

    @Value("${space-group.space-project.epark}")
    private List<Integer> ids1 =  new ArrayList<>();

    @Value("${space-group.space-project.dsyy}")
    private List<Integer> ids2 =  new ArrayList<>();

    @Value("${space-group.space-project.ksyy}")
    private List<Integer> ids3 =  new ArrayList<>();

    @RequestMapping(value="test")
    public void test(){

//        List<Integer> list = new ArrayList<>();
//
//        switch (indes){
//            case 1: {
//                list.addAll(ids1);
//                break;
//            }
//            case 2:{
//                list.addAll(ids2);
//                break;
//            }
//            case 3:{
//                list.addAll(ids3);
//                break;
//            }
//            default:{
//                list.addAll(new ArrayList<>()) ;
//            }
//
//        }
if(ids3.contains(1)){
    System.out.println("---------------------");
}
//        if(list!=null && list.size()>0)
////            ids.stream().forEach(e-> System.out.println(e));
//            System.out.println(list);
    }


//@Autowired
//private FeignService feignService;

//    @RequestMapping(value="getFeignList")
//    public UserDO getFeignList(){
//        UserDO result =feignService.getFeignList();
//        return result;
//    }
}
