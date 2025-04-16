package com.cafecomdeploy.DependencyInversion.correct;

public class TrainingPlan {
    private Exercise exercise; // Depende da interface, não da implementação

    public TrainingPlan(Exercise exercise) {
        this.exercise = exercise; // Injeção de dependência
    }

    public void startTraining() {
        exercise.perform(); // Executa qualquer exercício
    }
}
