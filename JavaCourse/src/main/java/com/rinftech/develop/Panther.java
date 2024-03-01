package com.rinftech.develop;

public class Panther extends Animal{
    private String meal;
    private String sound;
    public Panther(String meal, String sound){
        this.meal = meal;
        this.sound = sound;
    }

    @Override
    public String sound(){
        return this.sound;
    }
}
