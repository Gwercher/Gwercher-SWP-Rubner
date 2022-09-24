public class Main {
    public static void main(String[] args) {


        BinarySearch ob = new BinarySearch();
        int array[] = { 3, 4, 5, 6, 7, 8, 9 };
        int n = array.length;
        int x = 4;
        int result = ob.binarySearch(array, x, 0, n - 1);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);



        char letters[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p'
                , 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int m = letters.length;





    }

    }


    class BinarySearch {
        int binarySearch(int array[], int x, int low, int high) {

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

         char letterSearch(int array[], char x, char low, char high){

            while(low <= high){


            }





        }

}
