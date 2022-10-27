package com.revature.services;

public class WorkoutService {

    public WorkoutService(){
        System.out.println("Workout Service Instantiated!");
    }

    public String featchWorkoutRoutine(String coachType){
        switch (coachType.toLowerCase()){
            case "baseball":
                return "Today's workout: Spend an hour at batting practice";
            case "track":
                return "Today's workout: Run a 5k in 30 minutes";
            case "football":
                return "Today's workout: Suicide runs to the 40, 50, 60, 70, 80, 90 and 100 yard lines";
            default:
                return "No workout to provide. Enjoy your day";

        }
    }
}
