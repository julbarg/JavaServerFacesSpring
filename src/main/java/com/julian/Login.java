package com.julian;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.julian.dao.DocSisAuditDAO;
import com.julian.dao.UserDAO;
import com.julian.dto.User;
import com.julian.entity.DocsisAuditEntity;
import com.julian.entity.UserEntity;


@Component
@ManagedBean(name = "login")
@SessionScoped
public class Login {

   @Autowired
   private UserDAO userDAO;

   @Autowired
   private DocSisAuditDAO docSisAuditDAO;

   private User user;

   @PostConstruct
   private void initialize() {
      user = new User();
   }

   public void signIn() {
      try {
         System.out.println("signIn");
         ArrayList<UserEntity> listUsers = userDAO.findAll();
         for (UserEntity user : listUsers) {
            System.out.println(user);
         }
         ArrayList<DocsisAuditEntity> listDocsisAuditEntities = docSisAuditDAO.findAll();
         for (DocsisAuditEntity docsisAuditEntity : listDocsisAuditEntities) {
            System.out.println(docsisAuditEntity);
         }
         UserEntity user = new UserEntity("camila", "213532", "admin");
         userDAO.create(user);

      } catch (Exception e) {
         e.printStackTrace();
      }

   }

   public User getUser() {
      return user;
   }

   public void setUser(User user) {
      this.user = user;
   }

}