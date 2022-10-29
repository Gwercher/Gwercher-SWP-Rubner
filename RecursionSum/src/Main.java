import java.sql.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        int n = 6;

        System.out.println("Recursion: ");
        System.out.print(" " + sumRecursion(n));

        System.out.println("\n\nIterative: ");
        System.out.println(sumIterative(n));

    }

    public static int sumRecursion(int n){
        System.out.print(n);
        if(n == 1){
                System.out.print(" =");
            return n;
        }
        else{
                System.out.print(" + ");
            return n + sumRecursion(n-1);
        }
    }

    public static int sumIterative(int n){

        int sum = 0;

        for(int i = n; i > 0; i--){
            sum = sum + i;

                if(i != 1){
                    System.out.print(i + " + ");
                }
                else{
                    System.out.print(i + " = ");
                }
        }


        return sum;
    }




}
