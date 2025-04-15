package com.cafecomdeploy;

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
    }
}