package Lesson5_2019_Week03;

public class Temporary {

        public static void main(String[] args) {
            System.out.println("---- start ----");

            int i; // declaration
            i = 0; // initialization
            int j = 0; // combined

            // 1 - define test array
            int[] testArr = {2, 4, 7, 4, 1};

            // 4 - call the function
            DublicateFinder df = new DublicateFinder();
            int[] a = df.findDubs(testArr);
            for (int k = 0; k < a.length; k++) {
                System.out.println(a[k]);
            }
        }
    }