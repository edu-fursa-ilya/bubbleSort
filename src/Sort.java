import java.util.Random;

/**
 * Created by fs-pc on 10.06.17.
 */
public class Sort {

    public static int[] fill(int arr[]) {
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(random.nextInt() % 100);
        }

        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }


        return arr;
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        return arr;
    }

    public static void printArr(int[] arr) {
        System.out.println("\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}
