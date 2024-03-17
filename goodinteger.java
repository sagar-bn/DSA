
// "static void main" must be defined in a public class.
//good integer means we have check whether arr[i]==count of elements which are less than //arr[i] then the result should be count which is true
import java.util.*;

public class goodinteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = GoodInteger(arr, n);
        System.out.print(result);
    }

    static int GoodInteger(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == i) {
                count++;
            } else {
            }

        }
        return count;
    }

}