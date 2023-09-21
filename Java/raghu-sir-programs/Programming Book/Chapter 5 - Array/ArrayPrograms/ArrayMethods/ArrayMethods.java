package ArrayMethods;
import java.util.Scanner;

public class ArrayMethods {
    public static Scanner sc = new Scanner(System.in);

    //To print the array
    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    //To read the array
    public static int[] readArray() {
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        System.out.println("Enter the elements of array: ");
        int[] array = new int[size];
        for(int i=0; i<array.length; i++) {
            array[i] = sc.nextInt();
        }

        return array;
    }


    //USED IN Q02
    //to get the sum of all the elements of the array
    public static int getSum(int[] array) {
        int sum = 0;

        for(int i=0; i<array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

    
    //USED IN Q03, Q35
    //To get minimum/lowest/smallest element of array
    public static int getSmallest(int[] array) {
        int smallestValue = array[0];

        for(int i=0; i<array.length; i++) {
            if(smallestValue > array[i]) {
                smallestValue = array[i];
            }
        }

        return smallestValue;
    }


    //USED IN Q04, Q35
    //To get maximum/highest/biggest element of array
    public static int getBiggest(int[] array) {
        int biggestValue = array[0];

        for(int i=0; i<array.length; i++) {
            if(biggestValue < array[i]) {
                biggestValue = array[i];
            }
        }

        return biggestValue;
    }


    //USED IN Q05
    //To get the average of all elements of array
    public static double getAverage(int[] array) {
        int sum=0;

        for(int i=0; i<array.length; i++) {
            sum = sum + array[i];
        }
        
        return (double)sum/array.length;
    }


    //USED IN Q21
    //To reverse the array
    public static int[] reverseArray(int[] array) {
        int[] reverseArray = new int [array.length];

        for(int i=0; i<array.length; i++) {
            reverseArray[i] = array[array.length-1-i];
        }

        return reverseArray;
    }


    //USED IN Q22
    //To merge two array
    public static int[] mergeArrays(int[] firArray, int[] secArray) {
        int[] mergedArray = new int[firArray.length + secArray.length];
        int j=0;

        for (int i=0; i<firArray.length; i++) {
            mergedArray[j] = firArray[i];
            j++;
        }

        for (int i=0; i<secArray.length; i++) {
            mergedArray[j] = secArray[i];
            j++;
        }

        return mergedArray;
    }


    //USED IN Q23
    //To insert a element at specified index in array
    public static int[] insertAtIndex(int[] array, int element, int index) {
        if(index < 0 || index > array.length) {
            System.out.println("Error: Index out of range.");
            return array;
        }

        int[] newArray = new int[array.length+1];
        newArray[index] = element;

        for(int i=0; i<newArray.length-1; i++) {
            if(i<index) {
                newArray[i] = array[i];
            }
            else {
                newArray[i+1] = array[i];
            }
        }

        return newArray;
    }


    //USED IN Q24
    //To delete a element at specified index in array
    public static int[] deleteAtIndex(int[] array, int index) {
        if(index < 0 || index >= array.length) {
            System.out.println("Error: Index out of range.");
            return array;
        }

        int[] newArray = new int[array.length-1];

        for(int i=0; i<newArray.length; i++) {
            if(i<index) {
                newArray[i] = array[i];
            }
            else {
                newArray[i] = array[i+1];
            }
        }

        return newArray;
    }
    

    //USED IN Q25
    //To insert a element at specified index in array
    public static int[] insertArrayAtIndex(int[] array, int[] secArray, int index) {
        if(index < 0 || index > array.length) {
            System.out.println("Error: Index out of range.");
            return array;
        }

        int[] newArray = new int[array.length + secArray.length];
        int i=0, j=0, k=0;

        while(i < newArray.length) {
            if(i<=index) {
                newArray[i++] = array[k++];
            }
            else {
                while(j<secArray.length) {
                    newArray[i++] = secArray[j++];
                }
                while(k<array.length) {
                    newArray[i++] = array[k++];
                }
            }
        }

        return newArray;
    }


    //USED IN Q26, Q36
    //To merge two array in zigzag order
    public static int[] mergeArrayZigZagOrder(int[] firArray, int[] secArray) {
        int[] mergedArray = new int[firArray.length+secArray.length];
        int i=0, j=0;

        while(i<firArray.length && i<secArray.length) {
            mergedArray[j++] = firArray[i];
            mergedArray[j++] = secArray[i++];
        }
        while(i<firArray.length) {
            mergedArray[j++] = firArray[i++];
        }
        while(i<secArray.length) {
            mergedArray[j++] = secArray[i++];
        }

        return mergedArray;
    }


    //USED IN Q27
    //To merge two sorted array into one array in sorted format
    public static int[] mergeSortedArray(int[] firArray, int[] secArray) {
        int[] mergedArray = new int[firArray.length+secArray.length];
        int i=0, j=0, k=0;

        while(i<firArray.length && j<secArray.length) {
            if(firArray[i] < secArray[j]) {
                mergedArray[k++] = firArray[i++];
            }
            else {
                mergedArray[k++] = secArray[j++];
            }
        }
        while(i<firArray.length) {
            mergedArray[k++] = firArray[i++];
        }
        while(i<secArray.length) {
            mergedArray[k++] = secArray[j++];
        }

        return mergedArray;
    }


    //USED IN Q28
    //To print the common elements between two arrays
    public static void printCommonElements(int[] firArray, int[] secArray) {
        for(int i=0; i<firArray.length; i++) {
            for(int j=0; j<secArray.length; j++) {
                if(firArray[i] == secArray[j]) {
                    System.out.print(firArray[i]+" ");
                }
            }
        }        
    }


    //USED IN Q29
    //To print the magic values from the array
    public static void printMagicValues(int[] array) {
        for(int i=0; i<array.length; i++) {
            int temp=array[i];

            while(temp>9) {
                int sum=0;
                while(temp!=0) {
                    int ld = temp%10;
                    sum = sum+ld;
                    temp /= 10;
                }
                temp=sum;   
            }
            if(temp==1) {
                System.out.print(array[i] + " ");
            }
        }
    }


    //USED IN Q30
    //To print the frequency of array elements
    public static void printFrequency(int[] array) {
        boolean[] arr = new boolean[array.length];

        for(int i=0; i<array.length; i++) {
            if(arr[i] == false) {
                int count=1;
                for(int j=i+1; j<array.length; j++) {
                    if(array[i] == array[j]) {
                        count++;
                        arr[j] = true;
                    }
                }
                System.out.println(array[i] + " Present -> " + count);
            }
        }
    }


    //USED IN Q31
    //To search the element if it is present in array or not return -1 if not present
    public static int searchInArray(int[] array, int element) {
        for(int i=0; i<array.length; i++) {
            if(array[i] == element) {
                return i;
            }
        }
        return -1;
    }


    //USED IN Q32, Q33, Q39
    //To sort the array using BubbleSort algorithm - [Biggest element first]
    public static int[] sortArray(int[] array) {
        int[] sArray = array;

        //using k for phases
        for(int k=0; k<sArray.length-1; k++){
            for(int i=0; i<sArray.length-1-k; i++){
                if(sArray[i] < sArray[i+1]){
                    int temp = sArray[i];
                    sArray[i] = sArray[i+1];
                    sArray[i+1] = temp;
                }
            }
        }

        return sArray;
    }


    //USED IN Q34
    //To return a array by removing the duplicates values
    public static int[] removeDuplicates(int[] array) {
        int[] newArray = array;

        for(int i=0; i<newArray.length; i++) {
            for(int j=i+1; j<newArray.length; j++) {
                if(newArray[i] == newArray[j]) {
                    newArray = deleteAtIndex(newArray, j);
                }
            }
        }

        return newArray;
    } 


    //USED IN Q37
    //To count the even numbers elements present in array
    public static int evenCountInArray(int[] array) {
        int count=0;

        for(int i=0; i<array.length; i++) {
            if(array[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }
    //USED IN Q37
    //To count the even numbers elements present in array
    public static int oddCountInArray(int[] array) {
        int count=0;

        for(int i=0; i<array.length; i++) {
            if(array[i] % 2 != 0) {
                count++;
            }
        }

        return count;
    }


    //USED IN Q38, Q36
    //To return the even numbers present in array
    public static int[] evenElementsInArray(int[] array) {
        int[] evenArray = new int[evenCountInArray(array)];
        int j=0;

        for(int i=0; i<array.length; i++) {
            if(array[i] % 2 == 0) {
                evenArray[j++] = array[i];
            }
        }

        return evenArray;
    }


    //USED IN Q38, Q36
    //To return the odd numbers present in array
    public static int[] oddElementsInArray(int[] array) {
        int[] oddArray = new int[oddCountInArray(array)];
        int j=0;

        for(int i=0; i<array.length; i++) {
            if(array[i] % 2 != 0) {
                oddArray[j++] = array[i];
            }
        }

        return oddArray;
    }  
}