package org.cth.service;

import org.cth.mapper.UserMapper;
import org.cth.model.CrmUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public void insert(CrmUser user) {
        userMapper.insert(user);
    }

    public List<CrmUser> findAll() {
        return userMapper.findAll();
    }
}
