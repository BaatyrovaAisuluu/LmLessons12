package com.example.lms12;

public class Cat implements Animal {
    private String name;
    private  int age;
    private String colour;

    public Cat() {
    }

    public Cat(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return
                "\nname   " + name + '\n' +
                "age     " + age +'\n'+
                "colour  " + colour ;
    }

    @Override
    public void catMinus() {
        System.out.println(name +" тын минус жагы жок ");
    }

    @Override
    public void catPlus() {
        System.out.println(name+" адамга жагымдуу  ");
    }
}
