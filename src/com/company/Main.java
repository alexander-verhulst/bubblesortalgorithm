package com.company;


import java.util.Scanner;

import static com.company.BubbleSort.bubbleSort;

public class Main {

    public static void main(String[] args) {

        Scanner fromKey = new Scanner(System.in);

        System.out.println();
        System.out.println("Bubble Sort Algorithm");
        System.out.println();
        System.out.println("The bubble sort algorithm works by going swapping elements that are adjacent to each other. \nBased " +
                            "on the value it will either move the element to the left or the right. \nThe result will be printed with smaller elements on the left and the larger elements on the right. ");
        System.out.println("The Bubble Sort is also known as the sinking sort, or can be called the comparison sort");


        int firstNum, secondNum, thirdNum;
        System.out.println();
        System.out.print("Enter a number: ");
        firstNum = fromKey.nextInt();
        System.out.print("Enter another random number: ");
        secondNum = fromKey.nextInt();
        System.out.print("Enter a third random number: ");
        thirdNum = fromKey.nextInt();
        System.out.println();
        int originalArray[] = { 5, secondNum, 3, -8, -1, firstNum, 10, 22, 34, -44, thirdNum, -2, 22 };
        System.out.println("Here is the original array in random order...");

        for(int i = 0; i < originalArray.length; i++) { //This the for loop for printing out the array
            System.out.print(originalArray[i] + " ");
        }
        System.out.println();

        bubbleSort(originalArray);

        System.out.println();
        System.out.println("Here is the array after the bubble sort algorithm...");

        for(int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i] + " ");
        }



    }
}
