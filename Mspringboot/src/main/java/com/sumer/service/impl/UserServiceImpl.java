package com.sumer.service.impl;

import com.sumer.dao.IUserDao;
import com.sumer.entity.User;
import com.sumer.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("ius")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao iUserDao;
    @Override
    public boolean loginCheck(User user) {
        return iUserDao.findLogin(user)==null?false:true;
    }
}