package com.company.model;

public class SmallMachine extends CrackingMachine {
    public SmallMachine() {
    }
    @Override
    public void shelling(){

    }
    @Override
    public void sorting(Nuts nuts){
            if(nuts.weight < 6) {
                System.out.println("The nut machine will start now");
                nuts.shellNuts();
            } else {
                System.out.println("The nuts are too small for this machine");

            }

    }
}
