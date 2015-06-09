package com.julian.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Service;

import com.julian.entity.DocsisAuditEntity;


@Service
public class DocSisAuditDAOImpl implements DocSisAuditDAO {

   @PersistenceContext(unitName = "DOCSIS")
   EntityManager entityManager;

   @Override
   public ArrayList<DocsisAuditEntity> findAll() throws Exception {
      TypedQuery<DocsisAuditEntity> query = entityManager.createNamedQuery("DocsisAuditEntity.findAll", DocsisAuditEntity.class);
      ArrayList<DocsisAuditEntity> results = (ArrayList<DocsisAuditEntity>) query.getResultList();
      entityManager.close();

      return results;
   }

}
