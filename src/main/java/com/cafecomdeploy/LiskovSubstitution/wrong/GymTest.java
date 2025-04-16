package com.cafecomdeploy.LiskovSubstitution.wrong;

public class GymTest {
    public static void main(String[] args) {
        Exercise pushup = new Pushup();
        pushup.perform(); // Lança exceção! Sistema quebra.
    }
}
