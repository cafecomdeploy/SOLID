package com.cafecomdeploy.DependencyInversion.wrong;

public class GymTest {
    public static void main(String[] args) {
        TrainingPlan plan = new TrainingPlan();
        plan.startCardio();           // Funciona
        plan.startStrengthTraining(); // Funciona
    }
}
