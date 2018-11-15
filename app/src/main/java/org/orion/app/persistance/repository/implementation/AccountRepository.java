package org.orion.app.persistance.repository.implementation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.orion.app.entity.Account;
import org.orion.app.persistance.repository.contract.IAccountRepository;

public class AccountRepository implements IAccountRepository{
    private SessionFactory sessionFactory;

    public AccountRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Account save(Account account){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(account);
        session.getTransaction().commit();
        session.close();
        return account;
    }
}
