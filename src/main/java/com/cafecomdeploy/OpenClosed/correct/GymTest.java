package com.cafecomdeploy.OpenClosed.correct;

public class GymTest {
    public static void main(String[] args) {
        // Versão CORRETA (OCP aplicado)
        CalorieCalculator correctCalc = new CalorieCalculator();
        Workout strength = new StrengthTraining();
        Workout cardio = new CardioSession();

        System.out.println("[CORRETO] Calorias (Força): " + correctCalc.calculateTotalCalories(strength, 30));
        System.out.println("[CORRETO] Calorias (Cardio): " + correctCalc.calculateTotalCalories(cardio, 30));
    }
}
