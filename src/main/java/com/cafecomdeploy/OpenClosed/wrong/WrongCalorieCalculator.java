package com.cafecomdeploy.OpenClosed.wrong;

public class WrongCalorieCalculator {

    // Violação: Precisa ser modificada para adicionar novos tipos de treino
    public double calculateCalories(String workoutType, int duration) {
        if (workoutType.equals("FORÇA")) {
            return duration * 5.0; // 5 calorias por minuto
        } else if (workoutType.equals("CARDIO")) {
            return duration * 8.0; // 8 calorias por minuto
        }
        return 0; // Novo tipo? Teremos que alterar este método!
    }
}
