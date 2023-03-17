package com.company;

public class Ex1 {
    public static void main(String[] args) {
        int value = 0;
        int randomNum = (int) Math.round(Math.random() * 100);
        while (value<10){
            value = value+1;
            System.out.print (100 + randomNum + value + " ");
        }

    }
}
