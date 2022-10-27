package com.revature.models;

import com.revature.services.WorkoutService;

public class TrackCoach implements Coach{

    private final WorkoutService workoutService;

    public TrackCoach(WorkoutService workoutService){
        this.workoutService = workoutService;
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
