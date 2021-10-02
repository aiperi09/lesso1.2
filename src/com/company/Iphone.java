package com.company;

public class Iphone extends Apple{
    private String nameIphone;

    public String getNameIphone() {
        return nameIphone;
    }

    public Iphone(String name, Asus asus, String nameIphone) {
        super(name, asus);
        this.nameIphone = nameIphone;

    }
    public String smartphone(String nameIphone){
        return "Модель смартфона" + this.nameIphone;

    }
    public final int smartphoneNumber(int numberIphone){
        return  numberIphone;


    }


}
