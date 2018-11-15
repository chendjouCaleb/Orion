package org.orion.app.persistance.repository.implementation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.orion.app.entity.Account;

public class AccountRepository {
    private SessionFactory sessionFactory;

    public AccountRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Account save(Account account){
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(account);
        session.getTransaction().commit();
        return account;
    }
}
