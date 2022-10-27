package com.revature.oop.encapsulation;

public class Driver {
    public void main(String[] args){
        Person bryan = new Person("Bryan", 25, 72);
        Person kaitlyn = new Person("Kaitlyn", 24, 67);

        //What is stopping me from changing some of this information to whatever I want
//        bryan.name = null;
//        kaitlyn.age = -16;
//        kaitlyn.height = 120;

        System.out.println(bryan);
        System.out.println(kaitlyn);
        // How do we protect our values to make sure invalid data does not come in?
        // We can start by making all of our fields private
        // This is a good step forward but now I can't change the variable at all
//        bryan.name = "Jozsef";
//        kaitlyn.age = 2;

        System.out.println(bryan.getName());

        // Let's try a new name
        System.out.println(bryan);
        bryan.setName("");
        System.out.println(bryan);

        // Let's test out
        // We need to find away to allow us to validate while trying to update the values
        // Now I should be able to access the value of name

        bryan.setName("Jozsef");

    }
}
