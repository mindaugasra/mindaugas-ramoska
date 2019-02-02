package Lesson5_2019_Week03;

public class MyClass {
    // algorithm for finding a minimum in array

    static int min(int[] arr){
        int min = arr[0];
        // iterating through all the elements in the array
        for(int i = 1; i < arr.length; i++){
            // if the currently presumed minimum
            // is bigger than the currently checked number
            // we know that we need to change the minimum
            // for that number
            if(min > arr[i]){

                min = arr[i];
            }
        }
        return min;
    }

    static int sumOfArr(int[] xyz){
        int sum = 0;

        // i = i + 1
        // i++
        // ++i
        // i += 1

        for(int i = 0; i < xyz.length; i = i + 1){

            // sum = sum + xyz[i];
            sum += xyz[i];
        }
        return sum;
    }

    public static void main(String args[]) {

        // initializing an array
        int arr[] = {2, 5, 77, 100003, 564, -5, -9999999};

        // calling the min function
        System.out.println("---- min() ----");
        System.out.println(min(arr));
        int arr2[] = {2, 5, 7, 10};

        // calling the sumOfArr function
        System.out.println("---- sumOfArr() ----");
        System.out.println(sumOfArr(arr2));
    }
}