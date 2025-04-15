package com.cafecomdeploy.OpenClosed.correct;

public class CardioSession implements Workout{
    @Override
    public double calculateCaloriesBurned(int duration) {
        return duration * 8.0;
    }
}

