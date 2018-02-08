package com.company.model;

public class LargeMachine extends CrackingMachine {
    public LargeMachine() {

    }
    @Override
    public void shelling(){

    }
    @Override
    public void sorting(Nuts nuts){
        if(nuts.weight > 5) {
            System.out.println("The nut machine will start now");
            nuts.shellNuts();
        } else {
            System.out.println("The nuts are too small for this machine");

        }

    }

}
