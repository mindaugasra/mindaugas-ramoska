package Lesson5_2019_Week03;

public class DublicateFinder {
        public int[] findDubs(int[] arr){

            int count = 0;
            for(int i = 0; i < arr.length; i++) {
                for(int j = i + 1; j < arr.length; j++){
                    if(arr[i] == arr[j]){
                        count++;
                    }
                }
            }
            int[] dubs = new int[count];
            int x = 0;

            for(int i = 0; i < arr.length; i++) {
                for(int j = i + 1; j < arr.length; j++){
                    if(arr[i] == arr[j]){
                        dubs[x] = arr[i];

                        x++;
                    }
                }
            }
            return dubs;
        }
    }

