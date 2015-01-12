import java.util.Arrays;

/**
 * Created by Elijah on 1/12/2015.
 */
public class ManageSort {
    public static void main(String[] args) {
        int[] array = {2, 5, 4, 6, 8, 5, 4, 7, 65, 58};
        Sort sort = new Sort();
        System.out.println(Arrays.toString(Sort.selectionSort(array)));
        System.out.println(Arrays.toString(Sort.bubbleSort(array)));
    }
}
