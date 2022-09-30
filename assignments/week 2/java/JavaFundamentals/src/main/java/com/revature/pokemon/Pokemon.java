package com.revature.pokemon;

import java.awt.image.AffineTransformOp;
import java.util.Random;

public class Pokemon {
    /*
    We need to think about what kind of information we want to store about the pokemon
    SO things we may want are name, level, health, attack
     */

    String name;

    int level;

    int health;

    int attack;

    //We're adding on this field

    boolean fainted;

    // Now that we have a pokemon we might want to find some way to construct our pokemon object

    public Pokemon(String name) {
        this.name = name;
        // Now how do we randomize some values?

        Random random = new Random();

        // Now we have a random object let's create some random values

        this.level = random.nextInt(100) + 1;

        this.health = random.nextInt(100) + 1;

        this.attack = random.nextInt(100) + 1;

        this.fainted = false;
    }

    /*
    We now have a way to create a pokemon object but what about attacking and stuff?

    We need to create a method soo these pokemon can battle

    We can also create an attempt catch method
     */

    // Let's start out method for battling pokemon

    public Pokemon battle(Pokemon opponent){

        // How do we battle?

        // When my pokemon attacks another pokemon, my attack should reduce their health and their attack should
        // reduce my pokemon's health

        /*
        opponent.health -= this.attack;
        this.health -= opponent.attack;
        return opponent;
         */

        // We ran into a problem where our pokemon's health went negative
        // How to we prevent this?

        // Instead of immediately decreasing health we should make sure it doesn't make things go negative
        // This is for when we attack them
        if (opponent.health - this.attack <= 0){
            // Oppenent health is negative so we need to mark the pokemon as fainted
            opponent.health = 0;

            // How do we mark if the pokemon is fainted or not
            // Let's create a boolean value representation of the fainted status

            opponent.fainted = true;

        } else{
            // This means their health is positive, so they can keep battling
            opponent.health -= this.attack;
        }

        // This is for when they attack us
        if (this.health - opponent.attack <= 0){

            this.health = 0;

            this.fainted = true;

        } else{

            this.health -= opponent.attack;
        }

        // return the other pokemon

        return opponent;

    }

}
