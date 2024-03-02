package com.rinftech.develop;

public class Tiger extends Animal{
    private String meal;
    private String sound;
    public Tiger(String meal,String sound){
        this.meal = meal;
        this.sound = sound;
    }

    @Override
    public String sound(){
        return this.sound;
    }
}
