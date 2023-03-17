package com.company;

public class Ex5 {
    public static void main(String[] args) {
    int speed = 120;
        if (speed<=50){
            System.out.println("No violations");
        }else if (speed>50 && speed<60){
            System.out.println("Rebuke");
        }
        else if (speed>60 && speed<70){
            System.out.println("Fine is 80 euros");
        }
        else if (speed>70){
            System.out.println("Deprivation");
        }


    }

}

