package com.cafecomdeploy.InterfaceSegregation.wrong;

public class GymTest {
    public static void main(String[] args) {
        GymActivity yoga = new Yoga();
        yoga.doStretching(); // Funciona
        yoga.liftWeights();  // Lança exceção! Quebra o ISP.
    }
}
