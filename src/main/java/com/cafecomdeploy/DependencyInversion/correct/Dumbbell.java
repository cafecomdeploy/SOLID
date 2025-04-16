package com.cafecomdeploy.DependencyInversion.correct;

public class Dumbbell implements Exercise {
    @Override
    public void perform() {
        System.out.println("Levantando halteres...");
    }
}
