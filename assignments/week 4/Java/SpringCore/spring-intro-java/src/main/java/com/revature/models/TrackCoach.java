package com.revature.models;

import com.revature.services.MotivationalService;
import com.revature.services.WorkoutService;

public class TrackCoach implements Coach{

    private final WorkoutService workoutService;

    private final MotivationalService motivationalService;

    // Constructor Dependency Injection
    public TrackCoach(WorkoutService workoutService, MotivationalService motivationalService) {
        System.out.println("Track Coach Initialized!");
        this.workoutService = workoutService;
        this.motivationalService = motivationalService;
    }

    @Override
    public String getDailyWorkout() {
        return workoutService.fetchWorkoutRoutine("track");
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