
// "static void main" must be defined in a public class.
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class hashmapfreq {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // int k = sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i]) == true) {
                int temp = hm.get(arr[i]);
                hm.put(arr[i], temp + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        int m = sc.nextInt();
        int[] ar = new int[m];
        for (int i = 0; i < m; i++) {
            ar[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int val = ar[i];
            if (hm.containsKey(val) == true) {
                System.out.println(hm.get(val));
            } else {
                System.out.println("0");
            }

        }

    }
}