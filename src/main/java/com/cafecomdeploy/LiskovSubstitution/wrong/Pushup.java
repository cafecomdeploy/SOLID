package com.cafecomdeploy.LiskovSubstitution.wrong;

public class Pushup extends Exercise {
    // Método exige um parâmetro adicional, alterando a assinatura do método pai!
    public void perform(int reps) {
        System.out.println("Performing " + reps + " pushups...");
    }

    @Override
    public void perform() {
        throw new UnsupportedOperationException("Pushup requires reps parameter!");
    }
}


