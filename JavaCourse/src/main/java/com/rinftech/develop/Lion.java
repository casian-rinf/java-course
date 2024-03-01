package com.rinftech.develop;

public class Lion extends Animal{
    private String meal;
    private String sound;
    public Lion(String meal, String sound){
        this.meal = meal;
        this.sound = sound;
    }

    @Override
    public String eat(){
        return this.meal;
    }

    @Override
    public String sound(){
        return this.sound;
    }
}
