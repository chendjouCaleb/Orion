package org.orion.app.persistance.configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;
import org.orion.app.entity.Account;
import org.orion.app.entity.User;

class HibernateMySqlConfigurationTest {

    @Test
    void Save() {
        HibernateMySQLConfiguration configuration = new HibernateMySQLConfiguration();
        configuration.configure();
        configuration.addClass(Account.class);
        configuration.buildSessionFactory();

        Account user = new Account();
        user.setName("Chendjou");
        user.setSurname("Caleb");

        SessionFactory sessionFactory = configuration.sessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(user);

        session.getTransaction().commit();
        session.close();

        System.out.println("New user id: " + user.getId());
    }
}