package com.revature.servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.daos.FlashcardDao;
import com.revature.models.Flashcard;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

// Annotation Based Registration
//@WebServlet(
//        urlPatterns = "/flashcard",
//        loadOnStartup = 2,
//        initParams = {
//                @WebInitParam(name = "flashcard-servlet-key", value = "flashcard-servlet-value"),
//                @WebInitParam(name = "another-param", value = "another-value")
//        })
public class FlashcardServlet extends HttpServlet {

        // This is bad practice since we need to create some sort of ObjectMapper object everytime we create a servlet
        private final ObjectMapper mapper;

        private final FlashcardDao fd;

        public FlashcardServlet(ObjectMapper mapper, FlashcardDao fd) {
                this.mapper = mapper;
                this.fd = fd;
        }


        @Override
        public void init() throws ServletException {
                System.out.println("[LOG] - FlashcardServlet Instantiated!");
                System.out.println("[LOG] - Init param flashcard-servlet-key: " + this.getServletConfig().getInitParameter("flashcard-servlet-key"));
                System.out.println("[LOG] - Init param test-init-key: " + this.getServletConfig().getInitParameter("test-init-key"));
                System.out.println("[LOG] - Context param test-init-key: " + this.getServletContext().getInitParameter("test-context-key"));
        }

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

                // Pretend this value came from the database
//        Flashcard card = new Flashcard(123, "What does OOP stand for?", "Object Oriented Programming");

                // We'll now actually call the database to get the list of cards

                List<Flashcard> cards = fd.getCards();

                String respPayload = mapper.writeValueAsString(cards); // Converting to JSON string
                resp.setContentType("application/json"); // Tells postman to expect a JSON
                resp.getWriter().write(respPayload); // Writes the response before we send it back
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                // The user wants to hit this endpoint to create a new flashcard
                // We want to verify that the user is logged in appropriately to actively do this

                HttpSession session = req.getSession(false); // Verifies a session already exists but does not create one

                // check the session to see if null
                if (session == null){
                        resp.setStatus(400);
                        resp.setContentType("application/json");


                        HashMap<String, Object> errorMessage = new HashMap<>();

                        errorMessage.put("Status code", 400);
                        errorMessage.put("Message", "No user found with provided credentials");
                        errorMessage.put("Timestamp", LocalDateTime.now().toString());

                        resp.getWriter().write(mapper.writeValueAsString(errorMessage));
                        return;
                }

                // This is where you might actually call upon the service layer and eventually persist your card to the database
        }
}