package com.cafecomdeploy.InterfaceSegregation.correct;

public class WeightTraining implements WeightLifting {
    @Override
    public void liftWeights() {
        System.out.println("Musculação: levantando 100kg...");
    }
}

