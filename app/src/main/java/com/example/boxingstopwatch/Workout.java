package com.example.boxingstopwatch;

public class Workout {

    private String name;
    private String description;


    public static final Workout[] workouts = {
         new Workout("The Limb Loosener","5 Handstand push-ups\10 " +
                             "1-legged squats\n15 Pull-ups"),
         new Workout("Core Agony","100 Pull-ups\n100 Push-ups\n100" +
                 "Sit-ups\n100 Squats"),


    public Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
