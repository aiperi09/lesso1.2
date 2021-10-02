package com.company;

public class Main {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Acer",Asus.APPLE,"Samsung");
        System.out.println(iphone.smartInfo());
        System.out.println(iphone.smartphoneNumber(65734));

        Samsung samsung = new Samsung("dkfj",Asus.SAMSUNG,"dffhr","hggg");
        System.out.println(samsung.smartphoneNumber(65734));
        System.out.println(samsung.smartInfo());

        Samsung samsung1 = new Samsung("dkfj",Asus.SAMSUNG,"dffhr","hggg");
        System.out.println(samsung1.smartInfo());


    }
}
