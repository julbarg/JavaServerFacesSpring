package com.julian;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Component;

import com.julian.dto.User;


@Component
@ManagedBean
@SessionScoped
public class Login {

   private User user;

   @PostConstruct
   private void initialize() {
      user = new User();
   }

   public void signIn() {
      System.out.println("signIn");
   }

   public User getUser() {
      return user;
   }

   public void setUser(User user) {
      this.user = user;
   }

}