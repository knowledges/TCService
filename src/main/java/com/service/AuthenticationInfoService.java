package com.service;

import com.pojo.AuthenticationInfo;

import java.util.List;

public interface AuthenticationInfoService {
    int addAuthenticationInfo(AuthenticationInfo authenticationInfo);
    int delAuthenticationInfoById(String userId);
    int updateAuthenticationInfo(AuthenticationInfo authenticationInfo);
    AuthenticationInfo queryByUserId(String userId);
    List<AuthenticationInfo> queryAllAuthenticationInfo();
}
