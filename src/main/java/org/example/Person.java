package org.example;

public class Person implements Animal{


    private Animal animal;
    private String name;
    private int age;

    public Person(Person person) {
        
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static void getAll(){
        System.out.println();
    }

    @Override
    public void animalPlus() {

    }

    @Override
    public void animalMinus() {

    }

    public void setHorse(Person horse) {
    }
}
