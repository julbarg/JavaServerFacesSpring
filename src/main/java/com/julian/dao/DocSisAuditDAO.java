package com.julian.dao;

import java.util.ArrayList;

import com.julian.entity.DocsisAuditEntity;


public interface DocSisAuditDAO {

   public ArrayList<DocsisAuditEntity> findAll() throws Exception;

}
