package com.cafecomdeploy.SingleResponsibility.correct;

public class GymReportGenerator {
    // Responsabilidade única: gerar relatórios
    public void generateReport(String memberName, double amount) {
        System.out.println("[CORRETO] Relatório: " + memberName + " pagou R$" + amount);
    }
}
