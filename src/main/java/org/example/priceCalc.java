package org.example;

public class priceCalc {
    public static void main(String[] args) {

        int toy = 37;
        int itemCount = 2;
        double totalPrice = 0.0;
        final double TAX_RATE = 0.05;
        double coupon = 15;
        // 定義 (宣告) 是否折扣開關 預設為:玩具大於30元可享有折扣
        boolean isDiscount = toy < 30;//F
        coupon = 5;
        //3. totalPrice 為 ((玩具 * 數量) - 折扣) * (1+稅率)
        // 因為 消費者購買的玩具不符合折扣(isDiscount) 的資格
        // ，所以沒有獲得折價券(coupon)
        // isDiscount = T 或 買超過3個玩具
        // 並且 &&
        // 或||
        // 反轉 !
        // ! = 不等於
        if (!isDiscount) {
            totalPrice = (toy * itemCount - coupon) * (1 + TAX_RATE);
            // 61.95 有折扣
        } else {
            // 77.7 沒有折扣
            totalPrice = (toy * itemCount ) * (1 + TAX_RATE);
        }
        System.out.print("總價為:"+totalPrice);
    }
}

