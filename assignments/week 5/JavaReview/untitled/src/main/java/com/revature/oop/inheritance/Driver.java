package com.revature.oop.inheritance;

public class Driver {

    public static void main(String[] args){

        Bird bird = new Bird(true);

        // this allows me to directly access the variables of the class itself
        // object.field is the syntax
        System.out.println(bird.hasTalons);

        // But can we access the fields of the parent?
        System.out.println(bird.name);
        System.out.println(bird.age);
        System.out.println(bird.voice);


        // Animal animal = new Animal("maya", 7, "bark");
        // How can I set the fields that belong to the parent?

        bird.name = "Polly";
        bird.age = 15;
        bird.voice = "chirp";

        System.out.println(bird.name);
        System.out.println(bird.age);
        System.out.println(bird.voice);

        System.out.println("-------------------------------------------------------------------");
        Bird bird1 = new Bird("Randall", 17, "chirp", true);

        System.out.println(bird.name);
        System.out.println(bird.age);
        System.out.println(bird.voice);

        Dog dog = new Dog;

        Cat cat = new Cat();

        bird.move(14);
        bird1.move(50);
        dog.move(100);
        cat.move(10);

        bird.speak();
        dog.speak();
        cat.speak();
    }
}
