package com.cafecomdeploy.InterfaceSegregation.wrong;

public class Yoga implements GymActivity {
    @Override
    public void doStretching() {
        System.out.println("Yoga: alongando...");
    }

    // Métodos não relevantes para Yoga!
    @Override
    public void liftWeights() {
        throw new UnsupportedOperationException("Yoga não usa pesos!");
    }

    @Override
    public void doCardio() {
        throw new UnsupportedOperationException("Yoga não é cardio!");
    }
}