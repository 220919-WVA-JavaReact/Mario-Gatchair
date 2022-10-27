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
        return workoutService.fetchWorkoutRoutine("football");
    }

    @Override
    public String getMotivation() {
        return motivationalService.fetchMotivationalQuote();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public WorkoutService getWorkoutService() {
        return workoutService;
    }

    // Setter Dependency Injection
    public void setWorkoutService(WorkoutService workoutService) {
        this.workoutService = workoutService;
    }

    @Override
    public MotivationalService getMotivationalService() {
        return motivationalService;
    }

    // Setter Dependency Injection
    public void setMotivationalService(MotivationalService motivationalService) {
        this.motivationalService = motivationalService;
    }
}