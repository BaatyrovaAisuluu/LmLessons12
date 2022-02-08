package com.example.lms12;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lms12Application {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPath = new ClassPathXmlApplicationContext
                ("ApplicationContext.xml");

        Person person = classPath.getBean("MyPerson", Person.class);
        Person personOne = classPath.getBean("yourPerson", Person.class);
        System.out.println(person);
        person.getAnimal().catMinus();
        person.getAnimal().catPlus();
        System.out.println();
        System.out.println("Жакшы коргон адамы");
        System.out.println(personOne);
        personOne.getAnimal().catPlus();
        personOne.getAnimal().catMinus();
        System.out.println();

    }

}
