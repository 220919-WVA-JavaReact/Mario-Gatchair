package com.revature.models;

import com.revature.services.MotivationalService;
import com.revature.services.WorkoutService;

public class BaseballCoach implements Coach{

    private final WorkoutService workoutService;

    private final MotivationalService motivationalService;

    // Constructor Dependency Injection
    public BaseballCoach(WorkoutService workoutService, MotivationalService motivationalService) {
        System.out.println("Workout Service Initialized");
        this.workoutService = workoutService;
        this.motivationalService = motivationalService;
    }


    @Override
    public String getDailyWorkout() {
        return workoutService.fetchWorkoutRoutine("baseball");
    }

    @Override
    public String getMotivation() {
        return motivationalService.fetchMotivationalQuote();
    }

    @Override
    public MotivationalService getMotivationalService() {
        return this.motivationalService;
    }
}