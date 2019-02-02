package Lesson5_2019_Week03;

public class Sorter {

    public static void insertionSort(double[] arr){

        for(int j = 1; j < arr.length; j++){
//            System.out.println("inside for()");
            double key = arr[j];
            int i = j - 1;
            while(i >= 0 && arr[i] > key){
                arr[i + 1] = arr[i];
                i = i - 1;

//                System.out.println("inside while()");
            }
            arr[i + 1] = key;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);

        }
    }
}