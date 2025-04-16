package com.cafecomdeploy.SingleResponsibility.wrong;

public class GymTest {
    public static void main(String[] args) {
    GymManagementViolation badGym = new GymManagementViolation();
        badGym.addMember("João Silva");
        badGym.processPayment(150.0);
        badGym.generateReport();
    }
}
