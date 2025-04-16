package com.cafecomdeploy.InterfaceSegregation.correct;

public class GymTest {
    public static void main(String[] args) {
        Stretching yoga = new Yoga();
        WeightLifting musculacao = new WeightTraining();

        yoga.doStretching(); // OK
        musculacao.liftWeights(); // OK
    }
}
