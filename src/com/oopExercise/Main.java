package com.oopExercise;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        String word;
        String[] container;

        do {
            System.out.println("Enter an array size ranging from 3-7 only. [3-7]");
            System.out.print("Size: ");
            size = scanner.nextInt();
            //to eat next line because of .nextInt()
            scanner.nextLine();
        }while(size > 7 || size < 3);

        System.out.println("\nEnter " + size + " strings to store inside an array below: ");
        container = new String[size];
        for (int i = 0; i < container.length; i++) {
            System.out.print("Word " + (i+1) + " : ");
            word = scanner.nextLine();
            container[i] = word;
        }

        for (int i = 0; i < container.length; i++) {
            int evenOrOdd, wordLength = container[i].length();
            System.out.println("\nString " + (i+1) + " = " + container[i]);
            if(wordLength > 5){
                System.out.println("Word length is " + wordLength + " which is MORE than 5. " +
                        "\nWill now print ODD index/indices of the array:");
                evenOrOdd = 1;
            }else{
                System.out.println("Word length is " + wordLength + " which is NOT MORE than 5. " +
                        "\nWill now print EVEN index/indices of the array:");
                evenOrOdd = 0;
            }
            for (int j = evenOrOdd; j < container.length; j+=2) {
                System.out.println("Index " + j + " : " + container[j]);
            }
        }
    }
}