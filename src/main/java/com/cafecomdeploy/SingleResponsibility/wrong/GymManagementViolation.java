package com.cafecomdeploy.SingleResponsibility.wrong;

public class GymManagementViolation {
    private String memberName;
    private double monthlyPayment;

    // Violação: Classe faz gestão de membros, pagamentos e relatórios
    public void addMember(String name) {
        this.memberName = name;
        System.out.println("[ERRADO] Membro adicionado: " + name);
    }

    public void processPayment(double amount) {
        this.monthlyPayment = amount;
        System.out.println("[ERRADO] Pagamento processado: R$" + amount);
    }

    public void generateReport() {
        System.out.println("[ERRADO] Relatório: " + memberName + " pagou R$" + monthlyPayment);
    }
}
