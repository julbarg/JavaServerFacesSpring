package com.julian.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Service;

import com.julian.entity.UserEntity;


@Service
public class UserDAOImpl implements UserDAO {

   @PersistenceContext
   EntityManager entityManager;

   @Override
   public ArrayList<UserEntity> findAll() throws Exception {
      TypedQuery<UserEntity> query = entityManager.createNamedQuery("UserEntity.findAll", UserEntity.class);
      ArrayList<UserEntity> results = (ArrayList<UserEntity>) query.getResultList();
      entityManager.close();

      return results;
   }

}
