import java.sql.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        int n = 6;

        System.out.println("Recursion: ");
        System.out.print(" " + sumRecursionCalcMethod(n));

        System.out.println("\n\nIterative: ");
        System.out.println(sumIterativeCalcMethod(n));


/*
        System.out.println("Recursion: " + sumRecursionSimple(n));
        System.out.println("Iterative: " + sumIterativeSimple(n));
*/
    }

    // with calculation method
    public static int sumRecursionCalcMethod(int n){
        System.out.print(n);
        if(n == 1){
                System.out.print(" =");
            return n;
        }
        else{
                System.out.print(" + ");
            return n + sumRecursionCalcMethod(n-1);
        }
    }

    public static int sumIterativeCalcMethod(int n){

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


    // without calculation method
    public static int sumRecursionSimple(int n){
        if(n == 1){
            return n;
        }
        else{
            return n + sumRecursionSimple(n-1);
        }
    }

    public static int sumIterativeSimple(int n){

        int sum = 0;

        for(int i = n; i > 0; i--){
            sum = sum + i;
        }

        return sum;
    }


}
