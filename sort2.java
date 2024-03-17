import java.util.Arrays;
import java.util.Scanner;

public class sort2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = orderofremoval(arr, n);

        System.out.print(result);

    }

    static int orderofremoval(int[] arr, int n) {
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int temp = arr[i] * (n - i);
            ans = temp + ans;

        }
        return ans;
    }
}