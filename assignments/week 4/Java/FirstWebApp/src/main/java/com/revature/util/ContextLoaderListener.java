package com.revature.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.daos.FlashcardDao;
import com.revature.daos.FlashcardDaoImpl;
import com.revature.servlets.AuthServlet;
import com.revature.servlets.FlashcardServlet;
import com.revature.servlets.UserServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRegistration;
import java.time.LocalDateTime;

public class ContextLoaderListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("[LOG] - The servlet context was initialized at " + LocalDateTime.now());

        // We can also programmatically define/register our servlets with the container here

        ObjectMapper mapper = new ObjectMapper();
        FlashcardDao fd = new FlashcardDaoImpl();
        UserServlet userServlet = new UserServlet(mapper);
        FlashcardServlet flashcardServlet = new FlashcardServlet(mapper, fd);
        AuthServlet authServlet = new AuthServlet(mapper);

        // Now I need to register it with the context itself
        ServletContext context = sce.getServletContext();
        ServletRegistration.Dynamic registeredServlet = context.addServlet("UserServlet", userServlet);
        // Now I can affect the fields that I wanted to before
        registeredServlet.addMapping("/users");
        registeredServlet.setLoadOnStartup(3);
        registeredServlet.setInitParameter("user-servlet-key", "user-servlet-value");
        registeredServlet.setInitParameter("another-param", "another-value");

        /*
        ExampleServlet exampleServlet = new ExampleServlet(mapper);
        context.addServlet("ExampleServlet", exampleServlet).addMapping("/examples");
         */

        // Register the servlet
        context.addServlet("FlashcardServlet", flashcardServlet).addMapping("/flashcards/*");
        context.addServlet("AuthServlet", authServlet).addMapping("/auth");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("[LOG] - The servlet context was destroyed at " + LocalDateTime.now());
    }
}