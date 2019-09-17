package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */
        int[] array = new int[40];
        array[0] = 0;
        array [0] = 1 ;
        for (int i=2; i<array.length;i++){
            array[i]=array[i-1]+array[i-2];

        }
        for (int j:array) System.out.println(j + " ");
    }
}