package com.muratyildirim.app.subeler;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.muratyildirim.app.configuration.HibernateConfig;

@Repository
public class SubelerRepository {

	List<Subeler> getAllSubeler() {
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
			return session.createQuery("select s.id, s.kodu, s.adi from Subeler s", Subeler.class)
					.list();
		}
	}

}
