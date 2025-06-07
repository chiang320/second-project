package org.example.model;

public interface Payable {
    double calculatePayment(); // 計算應付

    void processPayment(); // 處裡付款

    String getPaymentDetail(); // 取得付款
}
