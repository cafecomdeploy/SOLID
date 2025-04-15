package com.cafecomdeploy.OpenClosed.correct;

public class CalorieCalculator {
    public double calculateTotalCalories(Workout workout, int duration) {
        return workout.calculateCaloriesBurned(duration);
    }
}


