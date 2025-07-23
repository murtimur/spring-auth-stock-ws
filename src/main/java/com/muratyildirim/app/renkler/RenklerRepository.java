package com.muratyildirim.app.renkler;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.muratyildirim.app.configuration.HibernateConfig;

@Repository
public class RenklerRepository {

  public Renkler getRenk(Integer id) {
    try(Session session = HibernateConfig.getSessionFactory().openSession()) {
      return session.createQuery("select r.adi, r.id from Renkler r where r.id=:id",Renkler.class)
          .setParameter("id", id).uniqueResult();
    }
  }

}
