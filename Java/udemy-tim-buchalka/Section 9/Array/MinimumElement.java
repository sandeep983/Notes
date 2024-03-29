/*
Write a method called readInteger() that has no parameters and returns an int.
It needs to read in an integer from the user - this represents how many elements the user needs to enter.
Write another method called readElements() that has one parameter of type int
The method needs to read from the console until all the elements are entered, and then return an array containing the elements entered.
And finally, write a method called findMin() with one parameter of type int[].
The method needs to return the minimum value in the array.

The scenario is: 
1. readInteger() is called.
2. The number returned by readInteger() is then used to call readElements().
3. The array returned from readElements() is used to call findMin().
4. findMin() returns the minimum number.

[Do not try and implement this. It is to give you an idea of how the methods will be used]

TIP: Assume that the user will only enter numbers, never letters.
TIP: Instantiate (create) the Scanner object inside the method.
    There are two scanner objects, one for each of the two methods that are reading in input from the user.
TIP: Be extremely careful about spaces in the printed message.

NOTE: All methods should be defined as private static.
NOTE: Do not add a main method to the solution code.
*/

import java.util.Scanner;

public class MinimumElement {
    private static Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();

    private static int readInteger(){
        System.out.println("How many elements you are going to enter: ");
        int n = sc.nextInt();
        return n;
    }

    private static int[] readElements(int capacity){
        int[] array = new int[capacity];
        
        System.out.println("Enter the elements:\r");
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        return array;
    }

    private static int findMin (int[] array){
        //assuming array[0] is minimum
        int min=array[0];

        for(int i=1; i<array.length; i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int capacity = readInteger();
        int[] array = readElements(capacity);
        System.out.println("The minimum value in array is: "+findMin(array));
    }
}
