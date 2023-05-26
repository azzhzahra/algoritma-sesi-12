 import java.security.KeyFactorySpi;
import java.util.Arrays;

 public class App {
    public static int binarySearch(int [] arr, int input) {
        int a = 0 ;
        int b = arr.length -1 ;
        while (a <= b ) {
            int c = (a + b ) / 2 ;
            if (arr [c] == input) {
                return c ;
            } else if (arr[c] < input) {
                a = c = 1;
            } else {
                b = c - 1;
            }
        }
        return -1;
    }


    public static int linearSearch (int [] arr, int input) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input) {
                return i ;
            }
        }
        return -1;
    }


    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++ ) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr [j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void main (String[] args) {
        int[] arr ={55, 20, 90, 15, 30, 40, 35, 5, 10, 100 };
        int input = 15;
        long statTime = System.nanoTime();
        System.out.println("unsortad array: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("sorted array: " + Arrays.toString(arr));
        System.out.println("Binary :" + binarySearch(arr, input));
        System.out.println("Linear :" + linearSearch(arr, input));
        long endTime = System.nanoTime();
        long duration = (endTime - statTime);
        System.out.println("Execution Time: " + duration + "nanoseconds");
    }

 }