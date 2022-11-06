public class Main {

    public static void main(String[] args) {

        int n = 5;
        // 5! = 5 * 4 * 3 * 2 * 1 = 120

        System.out.print(" = " + Recursion(n));

    }

    public static int Recursion(int n){
        if( n < 0){
            System.out.println("wrong input, please no negative numbers :)");
            return -1;
        }
        else{
            return TailCall(1, n);
        }
    }

    public static int TailCall(int m, int n){
        if(n == 0){
            // end
           return m;
        }
        else{
            System.out.println(m + " x " + n);
            return TailCall(m * n, n - 1);
        }

    }







}
