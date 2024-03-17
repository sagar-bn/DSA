import java.util.Arrays;

public class goodintrepeat {

    public static void main(String[] args) {

        int[] arr = { -4, -2, 5, 3, 5, 3, 5, 5, 5, 8, 8, 8, 10 };
        int n = arr.length;
        int result = counting(arr, n);
        System.out.print(result);
    }

    static int counting(int[] arr, int n) {
        int count = 0;
        int lesscount = 0;
        for (int i = 1; i < n; i++) {
            Arrays.sort(arr);
            if (arr[i] == 0) {
                count++;
            }

            else {
                if (arr[i] == arr[i - 1]) {
                    lesscount = i;
                }

            }
            if (arr[i] == lesscount) {
                count++;
            } else {
            }

        }
        return count;

    }

}
