package com.muratyildirim.app.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HibernateConfig {

	private static final Logger logger = LoggerFactory.getLogger(HibernateConfig.class);

	private final AppProperties appProperties;

	private static SessionFactory sessionFactory;

	public HibernateConfig(AppProperties appProperties) {
		this.appProperties = appProperties;
		sessionFactory = buildSessionFactory();
	}

	private SessionFactory buildSessionFactory() {
		try {
			Configuration configuration = new Configuration();
			configuration.setProperty("hibernate.connection.driver_class", appProperties.getDataBase().driver());
			configuration.setProperty("hibernate.connection.url", appProperties.getDataBase().vturl());
			configuration.setProperty("hibernate.connection.username", appProperties.getDataBase().username());
			configuration.setProperty("hibernate.connection.password", appProperties.getDataBase().password());
			configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.SQLServer2012Dialect");
			configuration.setProperty("hibernate.show_sql", "false");
			configuration.setProperty("hibernate.hbm2ddl.auto", "none");

			configuration.addAnnotatedClass(com.muratyildirim.app.subeler.Subeler.class);
			configuration.addAnnotatedClass(com.muratyildirim.app.kasalar.Kasalar.class);
			configuration.addAnnotatedClass(com.muratyildirim.app.renkler.Renkler.class);

			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();
			return configuration.buildSessionFactory(serviceRegistry);
		} catch (Exception e) {
			logger.error("Hibernate Config Error : ", e);
			throw new ExceptionInInitializerError();
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		if (sessionFactory != null) {
			sessionFactory.close();
		}
	}

}
