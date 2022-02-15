package com.lihuking.gmall.service.impl;

import com.lihuking.gmall.entity.UserInfo;
import com.lihuking.gmall.mapper.UserInfroMapper;
import com.lihuking.gmall.service.UserInfroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfroImpl implements UserInfroService {

   @Resource
    private UserInfroMapper userInfroMapper;

    @Override
    public List<UserInfo> getUserInfroAll() {

        return userInfroMapper.selectAll();
    }
}
