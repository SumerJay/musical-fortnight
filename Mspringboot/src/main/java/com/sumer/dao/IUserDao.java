package com.sumer.dao;

import com.sumer.entity.User;

public interface IUserDao {
    User  findLogin(User user);
}
