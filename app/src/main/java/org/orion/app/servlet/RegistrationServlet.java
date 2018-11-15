package org.orion.app.servlet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.orion.app.entity.Account;
import org.orion.app.entity.User;
import org.orion.app.model.RegistrationModel;
import org.orion.app.persistance.configuration.DataConfiguration;
import org.orion.app.persistance.configuration.HibernateMySQLConfiguration;
import org.orion.app.persistance.repository.contract.IAccountRepository;
import org.orion.app.persistance.repository.implementation.AccountRepository;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/registration")
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/account/registration.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Account account = new Account();
        account.setName(req.getParameter("name"));
        account.setSurname(req.getParameter("surname"));
        account.setEmail(req.getParameter("email"));
        account.setPasswordHash(req.getParameter("password"));

        System.out.println(account);

        IAccountRepository accountRepository =
                (IAccountRepository) getServletContext().getAttribute("accountRepository");

        accountRepository.save(account);

        resp.sendRedirect("/login");


    }
}
