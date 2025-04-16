package com.cafecomdeploy.SingleResponsibility.correct;

public class GymTest {
    public static void main(String[] args) {
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
