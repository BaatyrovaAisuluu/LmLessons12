package com.example.lms12;

public class Person {

    private String personName;
    private int age;
    private Animal animal;

    public Person() {
    }

    public Person(String personName, int age, Animal animal) {
        this.personName = personName;
        this.age = age;
        this.animal = animal;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return
                "\npersonName   " + personName + '\n' +
                "age           " + age +'\n'+
                "              " + animal +'\n';
    }
}
