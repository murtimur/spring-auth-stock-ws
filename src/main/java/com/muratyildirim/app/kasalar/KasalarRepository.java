package com.muratyildirim.app.kasalar;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.muratyildirim.app.configuration.HibernateConfig;

@Repository
public class KasalarRepository {

	List<Kasalar> getAllKasalar() {
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
			return session.createQuery("select k.id, k.adi, k.kodu from Kasalar k", Kasalar.class)
					.list();
		}
	}

}
