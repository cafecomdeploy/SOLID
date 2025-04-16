package com.cafecomdeploy.LiskovSubstitution.correct;

public class GymTest {
    public static void main(String[] args) {
        Exercise handstand = new Handstand();
        Exercise pushup = new Pushup();

        // Substituição segura: Ambas as classes respeitam o contrato
        handstand.perform(); // Saída: "Fazendo handstand..."
        pushup.perform();    // Saída: "Fazendo 1 flexão..."
    }
}
