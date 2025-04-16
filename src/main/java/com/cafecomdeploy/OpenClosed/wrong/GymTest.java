package com.cafecomdeploy.OpenClosed.wrong;

public class GymTest {
    public static void main(String[] args) {
        // Versão ERRADA (violação do OCP)
        WrongCalorieCalculator wrongCalc = new WrongCalorieCalculator();
        System.out.println("[ERRADO] Calorias (Força): " + wrongCalc.calculateCalories("FORÇA", 30));
        System.out.println("[ERRADO] Calorias (Cardio): " + wrongCalc.calculateCalories("CARDIO", 30));

        // Adicionar Yoga? Precisaríamos MODIFICAR a classe existente!
    }
}
