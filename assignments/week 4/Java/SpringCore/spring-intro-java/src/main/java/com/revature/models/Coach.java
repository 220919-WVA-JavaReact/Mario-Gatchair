package com.revature.models;

import com.revature.services.MotivationalService;

public interface Coach {

    // Recall that an interface is basically a contract that stipulates that anything that implements it is
    // guaranteed to have at least these methods (it may more but these will be included)

    String getDailyWorkout();

    String getMotivation();

    MotivationalService getMotivationalService();
}