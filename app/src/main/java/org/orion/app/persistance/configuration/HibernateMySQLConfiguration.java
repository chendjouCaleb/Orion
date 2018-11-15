package org.orion.app.persistance.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateMySQLConfiguration {
    private SessionFactory sessionFactory;
    private Configuration configuration;

    public void configure() {
        configuration = new Configuration();
        configuration.setProperty("hibernate.dialect",
                "org.hibernate.dialect.MySQL57Dialect")
                .setProperty("hibernate.connection.driver_class",
                        "com.mysql.cj.jdbc.Driver")
                .setProperty("hibernate.connection.url",
                        "jdbc:mysql://127.0.0.1:3306/orion")
                .setProperty("hibernate.connection.username", "root")
                .setProperty("hibernate.connection.password", "constitution")
                .setProperty("hibernate.hbm2ddl.auto", "update")
                .setProperty("hibernate.current_session_context_class", "thread")
                .setProperty("hibernate.enable_lazy_load_no_trans", "true");


    }
    public void addClass(Class type) {
        configuration.addAnnotatedClass(type);
    }

    public void buildSessionFactory(){
        sessionFactory = configuration.buildSessionFactory();
    }

    public SessionFactory sessionFactory() {
        return sessionFactory;
    }

}
