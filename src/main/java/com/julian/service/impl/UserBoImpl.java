package com.julian.service.impl;

import org.springframework.stereotype.Service;

import com.julian.service.UserBo;


@Service
public class UserBoImpl implements UserBo {

   public String getMessage() {

      return "JSF 2 + Spring Integration";

   }

}