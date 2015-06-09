package com.julian.entity;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name = "user")
@NamedQueries({ @NamedQuery(name = "UserEntity.findAll", query = "SELECT u FROM UserEntity u") })
public class UserEntity implements Serializable {
   private static final long serialVersionUID = 1L;

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;

   private String password;

   private String role;

   private String user;

   public UserEntity() {
   }

   public UserEntity(String user, String password, String role) {
      this.user = user;
      this.password = password;
      this.role = role;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getPassword() {
      return this.password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getRole() {
      return this.role;
   }

   public void setRole(String role) {
      this.role = role;
   }

   public String getUser() {
      return this.user;
   }

   public void setUser(String user) {
      this.user = user;
   }

   @Override
   public String toString() {
      String message = this.user + " - " + this.role;

      return message;
   }

}