package Lesson4_2019_Week02;

public class PrintArgs{
        public static void main(String[] a){
                System.out.print("-----\n");
                int sum = 0;
                for(int i = 0; 1 < a.length; i++){
                    sum = sum + Integer.parseInt(a[i]);
        }
                System.out.println(sum);
                System.out.println("Hello 2019!");

}
}
