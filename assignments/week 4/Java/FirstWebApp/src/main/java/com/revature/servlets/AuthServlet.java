package com.revature.servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.AppUser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AuthServlet extends HttpServlet {

    private final ObjectMapper mapper;

    public AuthServlet(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Hard coded users, pretend these came from the database
        List<AppUser> users = new ArrayList<>();

        users.addAll(Arrays.asList(
                new AppUser(1, "John", "Smith", "jsmith@revature.com", "jsmith", "test-password"),
                new AppUser(2, "Jane", "Doe", "jd42@revature.com", "jd42", "password"),
                new AppUser(3, "John", "Smith", "jsmith@revature.com", "jsmith1", "test-password"),
                new AppUser(4, "John", "Smith", "jsmith@revature.com", "jsmith2", "test-password"),
                new AppUser(5, "John", "Smith", "jsmith@revature.com", "jsmith3", "test-password")
        ));

        // I'm going to construct a new hashmap to store the credential login information
        HashMap<String, Object> credentials = mapper.readValue(req.getInputStream(), HashMap.class);

        // We'll essentially extract the information from this map
        String providedUsername = (String) credentials.get("username");
        String providedPassword = (String) credentials.get("password");

        // System.out.println(providedUsername + " " + providedPassword);

        // Now we'll just search through our list of users and see if we can get a match from the "database" of users
        for (AppUser user: users){
            if (providedUsername.equals(user.getUsername()) && providedPassword.equals(user.getPassword())){
                System.out.println("[LOG] - Found user!");

                /*
                Http is a stateless protocol, which means that no information is necessarily shared amongst requests
                So to persist that data of maybe who is logged in or something similar we need to create a session
                 */

                HttpSession session = req.getSession(); // This will create a session if one does not exist yet
                session.setAttribute("auth-user", user); // This attribute will be visible on any subsequent requests with this session attached
                // session.setAttribute("auth-user", mapper.writeValueAsString(user)); is an alternative way to do this which can be parsed

                resp.setStatus(204);
                return;
            }
        }

        resp.setStatus(400);
        resp.setContentType("application/json");


        HashMap<String, Object> errorMessage = new HashMap<>();

        errorMessage.put("Status code", 400);
        errorMessage.put("Message", "No user found with provided credentials");
        errorMessage.put("Timestamp", LocalDateTime.now().toString());

        resp.getWriter().write(mapper.writeValueAsString(errorMessage));


    }

    // Maybe we should create a method for logging out as well

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // First check if there is a session
        HttpSession session = req.getSession(false);

        // if the session exists invalidate the session
        if(session != null){
//            AppUser user = mapper.readValue((String) session.getAttribute("auth-user"), AppUser.class);

//            System.out.println(user.getUsername());
            System.out.println(session.getAttribute("auth-user"));
            session.invalidate();
        }

        resp.setStatus(204);
    }
}
