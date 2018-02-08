package com.company;

import com.company.model.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Nut Shelling Factory!");
        System.out.println("Would you like to sort some nuts? (Yes/No)");
        String sortNuts = sc.nextLine();
        if (sortNuts.equalsIgnoreCase("Yes")) {
            System.out.println("Great! Let's pick some nuts for you...");
        } else {
            System.out.println("Okay, have a nice day!");
            System.exit(0);
        }
        //code block to pause for dramatic effect :)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException pause) {
            pause.printStackTrace();
        }
        LargeMachine largeMachine = new LargeMachine();
        SmallMachine smallMachine = new SmallMachine();
        Almond almond = new Almond("Almond", 2, "CRUNCHCHCH");
        Hazelnut hazelnut = new Hazelnut("Hazelnut", 6, "MUSHSHSH");
        Peanut peanut = new Peanut("Peanut", 3, "RRRRRRRR");
        Pecan pecan = new Pecan("Pecan", 9, "MMMMMMMMM");
        Walnut walnut = new Walnut("Walnut", 4, "YUMMMMM");

        System.out.println("The nuts will go into the small machine  ");
        smallMachine.sorting(almond);
        smallMachine.sorting(hazelnut);
        smallMachine.sorting(peanut);
        smallMachine.sorting(pecan);
        smallMachine.sorting(walnut);

        System.out.println("The nuts will go into the large machine ");
        largeMachine.sorting(almond);
        largeMachine.sorting(hazelnut);
        largeMachine.sorting(peanut);
        largeMachine.sorting(pecan);
        largeMachine.sorting(walnut);


    }
}
