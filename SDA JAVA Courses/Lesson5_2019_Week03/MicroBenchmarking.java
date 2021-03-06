public class MicroBenchmarking {
        public static void main(String args[]) {
            // System.out.println(factorialIterative(6));
            // System.out.println(factorialRecursive(6));
            // System.out.println("0 --> " + fibRecursive(0));
            // System.out.println("1 --> " + fibRecursive(1));
            // System.out.println("2 --> " + fibRecursive(2));
            // System.out.println("3 --> " + fibRecursive(3));
            // System.out.println("4 --> " + fibRecursive(4));
            // System.out.println("5 --> " + fibRecursive(5));
            // System.out.println("6 --> " + fibRecursive(6));

            // 1st. micro-benching
//            int fibRes;
//            int input = 10;
//            long startTime = System.nanoTime();
//            fibRes = fibRecursive(10);
//            long endTime = System.nanoTime();
//            System.out.println("The fibRecursive(" + input + ") call took: " + (endTime - startTime) + "ns");

            // 2nd. micro-benching
            long startTime, endTime;
            int fibRes;
            for(int input = 1; input < 15; input++){
                startTime = System.nanoTime();
                fibRes = fibRecursive(input);
                endTime = System.nanoTime();
                System.out.println("The fibRecursive(" + input + ") call took: " + (endTime - startTime) + "ns");
            }
        }

        static int factorialIterative(int in){
            int fact = 1;
            for(int i = 1; i <= in; i++){
                // fact = fact * i;
                fact *= i;
            }
            return fact;
        }

        static int factorialRecursive(int in){
            int fact = in;
            // 1 - stopping condition
            if(in == 1)
                return in;
            // 2 - logic part
            fact = fact * factorialRecursive(in - 1);
            return fact;
        }

        // static int fibIterative(int in){
        // }
        static int fibRecursive(int in){
            int fib = in;
            // stoping condition
            if(in == 0)
                return 0;
            if(in <= 1)
                return 1;
            // logic
            fib = fibRecursive(in - 1) + fibRecursive(in - 2);
            return fib;
        }
    }