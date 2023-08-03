package com.example;

public class Shop {
    public static void main(String[] args) {
        Phone p=new Phone("Android", 2,
                "Qualcomm", 5.5, 3100);
        System.out.println(p);

        Phone p1 = new PhoneBuilder().setOs("iOS").setRam(2).getPhone();
        System.out.println(p1);
    }
}
