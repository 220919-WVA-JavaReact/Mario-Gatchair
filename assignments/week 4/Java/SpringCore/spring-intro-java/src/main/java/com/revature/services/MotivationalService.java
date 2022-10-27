package com.revature.services;

public class MotivationalService {

    public MotivationalService(){
        System.out.println("Motivational Service Initialized!");
    }

    public String fetchMotivationalQuote(){
        // Mock Quote we could pull this from some API later
        return "There is only do or do not, there is no try";
    }
}