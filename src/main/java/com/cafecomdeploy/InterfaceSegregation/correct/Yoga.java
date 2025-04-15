package com.cafecomdeploy.InterfaceSegregation.correct;

public class Yoga implements Stretching {
    @Override
    public void doStretching() {
        System.out.println("Yoga: alongamento avançado...");
    }
}
