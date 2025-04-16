package com.cafecomdeploy.DependencyInversion.correct;

public class GymTest {
    public static void main(String[] args) {
        Exercise treadmill = new Treadmill();
        Exercise dumbbell = new Dumbbell();

        TrainingPlan cardioPlan = new TrainingPlan(treadmill);
        TrainingPlan strengthPlan = new TrainingPlan(dumbbell);

        cardioPlan.startTraining();  // Saída: "Correndo na esteira..."
        strengthPlan.startTraining(); // Saída: "Levantando halteres..."
    }
}
