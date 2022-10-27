package com.revature.models;

import com.revature.services.MotivationalService;
import com.revature.services.WorkoutService;

public class BaseballCoach implements Coach{

    private final WorkoutService workoutService;

    private String email;

    private String teamName;

    private MotivationalService motivationalService;

    public BaseballCoach(){
        System.out.println("Baseball Coach Initialized!");

    public

    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getMotivation() {
      return motivationalService.fetchMotivationalQuote();
    }
}
