package com.revature.services;

public class WorkoutService {

    public WorkoutService(){
        System.out.println("Workout Service Initialized!");
    }

    // We could pretend that this is pulling from some api somewhere
    public String fetchWorkoutRoutine(String coachType){
        switch (coachType.toLowerCase()){
            case "baseball":
                return "Today's workout: Spend an hour at batting practice";
            case "track":
                return "Today's workout: Run a 5k in 30 minutes";
            case "football":
                return "Today's workout: Suicide runs to the 40, 50, 60, 70, 80, 90 and 100 yard lines";
            default:
                return "No workout to provide. Enjoy your day!";
        }

        // If I had additional logic we'd want break statements
    }
}