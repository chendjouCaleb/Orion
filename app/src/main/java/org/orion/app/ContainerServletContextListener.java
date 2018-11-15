package org.orion.app;

import org.hibernate.SessionFactory;
import org.orion.app.entity.Account;
import org.orion.app.persistance.configuration.HibernateMySQLConfiguration;
import org.orion.app.persistance.repository.implementation.AccountRepository;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContainerServletContextListener implements ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent contextEvent) {
        ServletContext servletContext = contextEvent.getServletContext();
        HibernateMySQLConfiguration configuration = new HibernateMySQLConfiguration();
        configuration.configure();
        configuration.addClass(Account.class);
        configuration.buildSessionFactory();
        SessionFactory sessionFactory = configuration.sessionFactory();

        AccountRepository accountRepository = new AccountRepository(sessionFactory);

        servletContext.setAttribute("sessionFactory", sessionFactory);
        servletContext.setAttribute("accountRepository", accountRepository);
    }
}
