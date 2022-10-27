package com.revature.models;

import com.revature.services.MotivationalService;
import com.revature.services.WorkoutService;

public class FootballCoach implements Coach{

    private String email;

    private String teamName;

    private WorkoutService workoutService;

    private MotivationalService motivationalService;

    public FootballCoach(){
        System.out.println("Football Coach Initialized!");
    }

    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getMotivation() {
        return null;
    }
}
