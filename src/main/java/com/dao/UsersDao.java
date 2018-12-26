package com.dao;

import com.pojo.Users;

import java.util.List;

public interface UsersDao {
    int addUsers(Users users);
    int delUsersById(String id);
    int updateUsers(Users users);
    Users queryById(String id);
    List<Users> queryAllUsers();
}
