import java.util.Arrays;

public class selectionsort {

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };

        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr, int start, int end, int max) {
        if (start == 0) {
            return;
        }
        if (end < start) {
            if (arr[end] > arr[max])

                selection(arr, start, end + 1, end);
            else {
                selection(arr, start, end + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[end - 1];
            arr[end - 1] = temp;
            selection(arr, start - 1, 0, 0);
        }

    }
}
