package com.julian.dao;

import java.util.ArrayList;

import com.julian.entity.UserEntity;


public interface UserDAO {

   public ArrayList<UserEntity> findAll() throws Exception;

}
