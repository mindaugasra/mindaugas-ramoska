public class Factorial2 {

    public static void main(String args[]) {
        System.out.println(factorial(5));
    }
    static int factorial(int in){
        int fact = 1;
        for(int i = 1; i <= in; i++){
            // fact = fact * i;
            fact *= i;
        }
        return fact;
    }
}