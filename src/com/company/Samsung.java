package com.company;

public final class Samsung extends Iphone{
    private String nameSamsung;

    public Samsung(String name, Asus asus, String nameIphone, String nameSamsung) {
        super(name, asus, nameIphone);
        this.nameSamsung = nameSamsung;
    }
    public String getNameSamsung() {
        return nameSamsung;
    }
    public String smartphone(String nameIphone){
        return super.smartphone(nameIphone);
    }
    public String smartInfo(){
        return super.smartInfo() +"Made in "+ nameSamsung;
    }


}

