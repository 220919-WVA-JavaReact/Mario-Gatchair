package com.revature.daos;

import com.revature.models.Flashcard;
import com.revature.util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlashcardDaoImpl implements FlashcardDao{

    // This is where our JDBC will go in just a few
    @Override
    public List<Flashcard> getCards(){

        // Let's create a list to store all our information
        List<Flashcard> cards = new ArrayList<>();

        // Time to use JDBC
        try (Connection conn = ConnectionUtil.getConnection()){

            // Let's create a statement and run it against our Database
            String sql = "SELECT * FROM flashcards";

            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()){
                // Create new flashcard object to store info
                Flashcard card = new Flashcard();

                card.setId(rs.getInt("id"));
                card.setQuestionText(rs.getString("question_text"));
                card.setAnswerText(rs.getString("answer_text"));

                // Add the card to the collection
                cards.add(card);
            }

        } catch (SQLException e) {
            System.err.println("An error occurred within FlashcardDao.getCards()");
        }

        return cards;
    }

}
