package com.cafecomdeploy.DependencyInversion.correct;

public class Treadmill implements Exercise {
    @Override
    public void perform() {
        System.out.println("Correndo na esteira...");
    }
}

