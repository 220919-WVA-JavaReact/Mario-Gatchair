package com.revature.pokemon;
import java.util.Random;
import java.util.Scanner;
public class PokemonGame {

    /*
    Goal: We want to create some sort of console application that allows us to traverse around and catch/battle pokemon

    For those uninitiated, in the game of pokemon you can have AT MOST6 pokemon with you at a time

    We should be able to maybe catch a pokemon, view our current pokemon and maybe view our party
     */

    public static void main(String[] args) {
        /*
        Pokemon p1 = new Pokemon("Sandshrew");

        Pokemon p2 = new Pokemon("Shinx");

        Pokemon p3 = new Pokemon("Staryu");

        Pokemon p4 = new Pokemon("Sableye");

        System.out.println(p1.attack + " " + p1.level + " " + p1.health);
        System.out.println(p2.attack + " " + p2.level + " " + p2.health);
        System.out.println(p3.attack + " " + p3.level + " " + p3.health);
        System.out.println(p4.attack + " " + p4.level + " " + p4.health);

        p1.battle(p2);

        System.out.println("------------------------------------------------------------");
        System.out.println(p1.name + " " + p1.attack + " " + p1.level + " " + p1.health);
        System.out.println(p2.name + " " + p2.attack + " " + p2.level + " " + p2.health);
       */
        boolean running = true;
        Scanner input = new Scanner(System.in);

        // Let's create our party of pokemon

        Pokemon[] party = new Pokemon[6];
        Pokemon p1 = new Pokemon("Sandshrew");
        party[0] = p1;

        int partySize = 1;

        String[] possibleEncounters = {"Shinx", "Sableye", "Staryu", "Lugia", "Pikachu", "Umbreon", "Sylveon", "Bayleaf"};
        Random random = new Random();
        while (running) {
            // All of our app stuff should go in here and this should only terminate when the user says so

            // Let's simulate an encounter

            // We need to give ourselves
            //Pokemon p1 = new Pokemon("Sandshrew");

            Pokemon p2 = new Pokemon(possibleEncounters[random.nextInt(possibleEncounters.length)]);

            //System.out.println(" You've encounterd a wild " + p2.name);

            //System.out.println("Press 1 to run, 2 to battle");

            System.out.println("Type 'run' to run, 'battle' to battle, and 'party' to view your party, or press 'q' to quit");
            // Now we need to collect the input from the user

            String choice = input.nextLine();


            //System.out.println(choice);

            if (choice.equals("run")){
                System.out.println("You ran from the battle");
            } else if (choice.equals("battle")) {
                // If we choose battle we have to suboptions to attack or catch
                String subchoice = input.nextLine();

                if (subchoice.equals("attack")){
                    System.out.println("Type attack or catch");
                    p1.battle(p2);
                    System.out.println(
                            "Your pokemon: " + p1.name + "\n"
                                    + "Health: " + p1.health + "\n"
                                    + "Fainted: " + p1.fainted
                    );
                    System.out.println(
                            "Opponent Pokemon: " + p2.name + "\n"
                                    + "Health: " + p2.health + "\n"
                                    + "Fainted: " + p2.fainted
                    );
                } else if (subchoice.equals("catch")){
                    // This is where we add the pokemon to our party
                    // Let's check to see if we have 6 pokemon, if not, add to the party
                    if (partySize < 6){
                        party[partySize] = p2;
                        partySize += 1;
                        for(int i = 0; i< party.length; i++){
                            if(party[i] != null) {
                                System.out.println(party[i].name);
                            }
                        }

                    } else {
                        System.out.println("You already have 6 pokemon");
                        break;
                    }

                }
            } else if(choice.equals("party")){
                System.out.println("Party");
                for(int i = 0; i< party.length; i++){
                    if(party[i] != null) {
                        System.out.println(party[i].name);
                    }
                }
            } else if(choice.equals("q")){
                break;
            }
            else{
                System.out.println("Invalid input");
            }


        }


    }
}