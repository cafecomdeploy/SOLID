package com.cafecomdeploy.SingleResponsibility.correct;

public class PaymentProcessor {
    private double monthlyPayment;

    // Responsabilidade única: processar pagamentos
    public void processPayment(double amount) {
        this.monthlyPayment = amount;
        System.out.println("[CORRETO] Pagamento processado: R$" + amount);
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }
}
