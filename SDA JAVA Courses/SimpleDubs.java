package Lesson5_2019_Week03;

public class SimpleDubs {
        public static void main(String[] args){

            int[] testArr = {2, 4, 7, 4, 1};
            findDubs(testArr);
        }

        public static void findDubs(int[] arr){

            for(int i = 0; i < arr.length; i++) {
                for(int j = i + 1; j < arr.length; j++){
                    if(arr[i] == arr[j]){
                        System.out.println(arr[i]);
                    }
                }
            }
        } // findDubs
    }
