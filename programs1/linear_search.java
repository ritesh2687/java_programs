import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("how many numbers u want to enter in this array");
        int num = in.nextInt();
        
        int[] arr = new int[num];
        for (int j = 0; j < num; j++) {
            System.out.println("please enter " + j + "index element");
            arr[j] = in.nextInt();
        }
        System.out.println("enter the target value");
        int target = in.nextInt();

        int ans = linearsearch(arr, target);
        System.out.println(ans);
    }

    static int linearsearch(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i <= arr.length; i++) {

            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
