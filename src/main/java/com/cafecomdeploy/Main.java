package com.cafecomdeploy;

import com.cafecomdeploy.LiskovSubstitution.wrong.Exercise;
import com.cafecomdeploy.LiskovSubstitution.wrong.Handstand;
import com.cafecomdeploy.LiskovSubstitution.wrong.Pushup;
import com.cafecomdeploy.OpenClosed.correct.CalorieCalculator;
import com.cafecomdeploy.OpenClosed.correct.CardioSession;
import com.cafecomdeploy.OpenClosed.correct.StrengthTraining;
import com.cafecomdeploy.OpenClosed.correct.Workout;
import com.cafecomdeploy.OpenClosed.wrong.WrongCalorieCalculator;
import com.cafecomdeploy.SingleResponsibility.correct.GymMemberManager;
import com.cafecomdeploy.SingleResponsibility.correct.GymReportGenerator;
import com.cafecomdeploy.SingleResponsibility.correct.PaymentProcessor;
import com.cafecomdeploy.SingleResponsibility.wrong.GymManagementViolation;

public class Main {
    public static void main(String[] args) {
// Versão ERRADA (violação do SRP)
        GymManagementViolation badGym = new GymManagementViolation();
        badGym.addMember("João Silva");
        badGym.processPayment(150.0);
        badGym.generateReport();

        System.out.println("------------------------");

        // Versão CORRETA (SRP aplicado)
        GymMemberManager memberManager = new GymMemberManager();
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        GymReportGenerator reportGenerator = new GymReportGenerator();

        memberManager.addMember("Maria Souza");
        memberManager.validateMember();
        paymentProcessor.processPayment(180.0);
        reportGenerator.generateReport(
                memberManager.getMemberName(),
                paymentProcessor.getMonthlyPayment()
        );

        System.out.println("------------------------");


        // Versão ERRADA (violação do OCP)
        WrongCalorieCalculator wrongCalc = new WrongCalorieCalculator();
        System.out.println("[ERRADO] Calorias (Força): " + wrongCalc.calculateCalories("FORÇA", 30));
        System.out.println("[ERRADO] Calorias (Cardio): " + wrongCalc.calculateCalories("CARDIO", 30));

        // Adicionar Yoga? Precisaríamos MODIFICAR a classe existente!

        System.out.println("------------------------");

        // Versão CORRETA (OCP aplicado)
        CalorieCalculator correctCalc = new CalorieCalculator();
        Workout strength = new StrengthTraining();
        Workout cardio = new CardioSession();

        System.out.println("[CORRETO] Calorias (Força): " + correctCalc.calculateTotalCalories(strength, 30));
        System.out.println("[CORRETO] Calorias (Cardio): " + correctCalc.calculateTotalCalories(cardio, 30));



        Exercise handstand = new Handstand();
        Exercise pushup = new Pushup(); // Substituição inválida!

        handstand.perform(); // Funciona
        pushup.perform();    // Lança exceção! Quebra Liskov.

        /*
        System.out.println("------------------------");
        Exercise handstand = new Handstand();
        Exercise pushup = new Pushup();
        Exercise warmUp = new WarmUpExercise();

        // Todos substituem Exercise corretamente!
        handstand.perform(); // OK
        pushup.perform();    // OK
        warmUp.perform();    // OK*/
    }
}