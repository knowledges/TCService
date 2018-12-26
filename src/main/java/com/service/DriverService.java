package com.service;

import com.pojo.Driver;

import java.util.List;

public interface DriverService {
    int addDriver(Driver driver);
    int delDriverById(String id);
    int updateDriver(Driver driver);
    Driver queryById(String id);
    List<Driver> queryAllDriver();
}
