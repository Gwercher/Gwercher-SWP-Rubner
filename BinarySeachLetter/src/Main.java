import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


/*
        int array[] = { 3, 4, 5, 6, 7, 8, 9 };
        int n = array.length;
        int x = 4;
        int result = binarySearch(letters, x, 0, n - 1);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
*/

        char letters[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p'
                , 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int n = letters.length;
        char x = 'b';
        int result = binaryLetterSearch(letters, x, 0, n - 1);

        if(result == -1){
            System.out.println("NA/Error");
        }
        else{
            for(int i = 0; i < letters.length; i++) {
                System.out.print(letters[i] + "[" + i + "]" + " ");
            }
            System.out.println("\n\nElement found.\nIndex: " + result + "\nLetter: " + x);
        }

    }

    static int binarySearch(int array[], int x, int low, int high) {

        // Repeat until the pointers low and high meet each other
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == x)
                return mid;

            if (array[mid] < x)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return -1;
    }

    static int binaryLetterSearch(char array[], char x, int low, int high){

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(array[mid] == x){
                return mid;
            }

            if (array[mid] < x)
                low = mid + 1;

            else
                high = mid - 1;

        }

        return -1;

    }





    }
