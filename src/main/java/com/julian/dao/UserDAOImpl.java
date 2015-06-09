package com.julian.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.julian.entity.UserEntity;


@Service
public class UserDAOImpl implements UserDAO {

   @PersistenceContext(unitName = "CPYMES")
   EntityManager entityManager;

   @Override
   public ArrayList<UserEntity> findAll() throws Exception {
      TypedQuery<UserEntity> query = entityManager.createNamedQuery("UserEntity.findAll", UserEntity.class);
      ArrayList<UserEntity> results = (ArrayList<UserEntity>) query.getResultList();

      return results;
   }

   @Override
   @Transactional("transactionManagerCpymes")
   public void create(UserEntity user) throws Exception {
      entityManager.persist(user);
   }

}
