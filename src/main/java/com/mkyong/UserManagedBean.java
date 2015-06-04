package com.mkyong;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mkyong.user.bo.UserBo;


@Component
@ManagedBean
@SessionScoped
public class UserManagedBean {

   @Autowired
   UserBo userBo;

   public void setUserBo(UserBo userBo) {
      this.userBo = userBo;
   }

   public String printMsgFromSpring() {
      return userBo.getMessage();
   }

}