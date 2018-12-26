package com.service.impl;

import com.dao.UsersDao;
import com.pojo.Users;
import com.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersDao usersDao;

    @Override
    public int addUsers(Users users) {
        return usersDao.addUsers(users);
    }

    @Override
    public int delUsersById(String id) {
        return usersDao.delUsersById(id);
    }

    @Override
    public int updateUsers(Users users) {
        return usersDao.updateUsers(users);
    }

    @Override
    public Users queryById(String id) {
        return usersDao.queryById(id);
    }

    @Override
    public List<Users> queryAllUsers() {
        return usersDao.queryAllUsers();
    }
}
