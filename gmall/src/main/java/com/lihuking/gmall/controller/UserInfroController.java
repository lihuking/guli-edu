package com.lihuking.gmall.controller;

import com.lihuking.gmall.entity.UserInfo;
import com.lihuking.gmall.service.UserInfroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserInfroController {

    @Resource
    private UserInfroService userInfroService;

    @GetMapping()
    public List<UserInfo> getgetUserInfoAll(){

        List<UserInfo> userInfroAll = userInfroService.getUserInfroAll();
        System.err.println("我是。。。"+userInfroAll);
        return userInfroAll;
    }
}
