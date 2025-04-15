package com.cafecomdeploy.SingleResponsibility.correct;

public class GymMemberManager {
    private String memberName;

    // Responsabilidade única: gerenciar membros
    public void addMember(String name) {
        this.memberName = name;
        System.out.println("[CORRETO] Membro adicionado: " + name);
    }

    public String getMemberName() {
        return memberName;
    }

    public void validateMember() {
        System.out.println("[CORRETO] Membro validado: " + memberName);
    }
}
