package com.revature;

import com.revature.models.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXMLDriver {

    public static void main(String[] args){
        System.out.println("Creating the Bean container...");

        try (ClassPathXmlApplicationContext beanContainer = new ClassPathXmlApplicationContext("beans.xml")){
            System.out.println("Bean Container Created!");

            Coach headCoach = beanContainer.getBean("myCoach", Coach.class);

            System.out.println(headCoach.getDailyWorkout());
            System.out.println(headCoach.getMotivation());

            Coach assistantCoach = beanContainer.getBean("myCoach", Coach.class);

            System.out.println("Do the coaches use the same motivational service?" + headCoach.);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
