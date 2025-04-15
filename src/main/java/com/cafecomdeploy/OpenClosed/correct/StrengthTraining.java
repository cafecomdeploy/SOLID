package com.cafecomdeploy.OpenClosed.correct;

public class StrengthTraining implements Workout{
    @Override
    public double calculateCaloriesBurned(int duration) {
        return duration * 5.0;
    }
}


