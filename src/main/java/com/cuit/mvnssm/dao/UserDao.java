package com.cuit.mvnssm.dao;

import com.cuit.mvnssm.pojo.User;

public interface UserDao {
    int deleteByPrimaryKey(int id);
    
    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(int id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}