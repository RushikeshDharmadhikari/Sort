import java.util.Arrays;

/**
 * Created by Elijah on 1/12/2015.
 */
public class Sort {
    public static int[] selectionSort(int[] array) {
        Arrays.sort(array);
        System.out.println("Inside Selection Sort");
        return array;
    }

    public static int[] bubbleSort(int[] array) {
        System.out.println("Inside Bubble Sort");
        Arrays.sort(array);
        return array;
    }

}
