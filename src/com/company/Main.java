package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        int sizeOfArray = 2;
        Random random = new Random();
        //do{
        //sizeOfArray = random.nextInt(100);
        //}while (sizeOfArray > 0 && sizeOfArray % 2 == 1);

        System.out.println("Sise of array = " + sizeOfArray);

        int[] myArray;
        myArray = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {

            int myVariable = random.nextInt(100);

            do{
                myVariable = random.nextInt(100);
            }while (myVariable % 2 == 1);
            myArray[i] = myVariable;
        }

        int halfOfArray = sizeOfArray / 2;
        System.out.println("Sise of half array = " + halfOfArray);
        Arrays.sort(myArray);
        for (int i = 0; i < halfOfArray; i++) {
            System.out.print(myArray[i] + " ");
        }

    }

}