import java.util.Scanner;

public class Array {
    public static Scanner sc = new Scanner(System.in);

    //average method
    public static double getAverage(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return (double)sum/arr.length;
    }
    
    //Creating a method to get the array values
    //and returning the array to myIntegers array in main method
    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values: \r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++){
            values[i] = sc.nextInt();
        }
        return values;
    }

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);

        for(int i=0; i<myIntegers.length; i++){
            System.out.println("Element " + i + ", typed values was: "+ myIntegers[i]);   
        }

        System.out.println("The average is: "+ getAverage(myIntegers));    
    }
}