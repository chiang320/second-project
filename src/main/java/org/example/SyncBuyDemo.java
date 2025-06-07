package org.example;

import org.example.model.Customer;
import org.example.model.ProductStock;
import org.example.model.SyncProductStock;

public class SyncBuyDemo {
    public static void main(String[] args) throws InterruptedException {
        SyncProductStock limitedStock = new SyncProductStock();
        int numberOfCustomer = 15;//15位客戶同時搶購
        System.out.println("===== 限量搶嘔活動開始囉 =====");
        System.out.println("初始庫存:" + limitedStock.quantity);

        Thread[] customers = new Thread[numberOfCustomer];
        for (int i = 0; i < numberOfCustomer; i++) {
            customers[i] = new Customer("顧客-" + (i + 1), limitedStock);
            customers[i].start();
        }

        for (int i = 0; i < numberOfCustomer; i++) {
            customers[i].join();
        }
        System.out.println("===== 限量搶嘔活動結束 =====");
        System.out.println("最終庫存:" + limitedStock.quantity);

    }
}


