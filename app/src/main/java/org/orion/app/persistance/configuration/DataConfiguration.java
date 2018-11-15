package org.orion.app.persistance.configuration;

import org.hibernate.SessionFactory;
import org.orion.app.entity.Account;
import org.orion.app.entity.User;

public class DataConfiguration {
    private static SessionFactory sessionFactory;

    private DataConfiguration() {}

    private static void initConfiguration(){
        HibernateMySQLConfiguration configuration = new HibernateMySQLConfiguration();
        configuration.configure();
        configuration.addClass(Account.class);

        configuration.buildSessionFactory();
        sessionFactory = configuration.sessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        if(sessionFactory == null){
            initConfiguration();
        }

        return sessionFactory;
    }
}
