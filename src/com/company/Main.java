package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int sizeOfArray = random.nextInt(100);

        do{
            sizeOfArray = random.nextInt(100);
        }while (sizeOfArray % 2 == 1);

        int[] myArray = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {

            int myVariable = random.nextInt(100);

            do{
                myVariable = random.nextInt(100);
            }while (myVariable % 2 == 1);
            myArray[i] = myVariable;
        }

        int halfOfArray = sizeOfArray / 2;
        Arrays.sort(myArray);
        for (int i = 0; i <= halfOfArray; i++) {
            System.out.print(myArray[i] + " ");
        }

    }

}

