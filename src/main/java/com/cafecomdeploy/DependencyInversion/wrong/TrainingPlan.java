package com.cafecomdeploy.DependencyInversion.wrong;

public class TrainingPlan {
    private Treadmill treadmill;
    private Dumbbell dumbbell;

    public TrainingPlan() {
        this.treadmill = new Treadmill(); // Acoplamento direto
        this.dumbbell = new Dumbbell();    // Alto acoplamento
    }

    public void startCardio() {
        treadmill.run(); // Dependência direta
    }

    public void startStrengthTraining() {
        dumbbell.lift(); // Dependência direta
    }
}


