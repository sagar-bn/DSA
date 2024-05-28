import java.util.*;

public class hashmap2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i]) == true) {
                int temp = hm.get(arr[i]);
                hm.put(arr[i], temp + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        for (int i = 0; i < n; i++) {
            int a = arr[i];
            int b = a - k;
            if (a != b && hm.containsKey(b) == true) {
                System.out.print("true:" + k);
                return;
            } else if (a == b && hm.containsKey(b) && hm.get(b) > 1) {
                System.out.print("true:" + k);
                return;
            }

        }
        System.out.print("failed");

    }
}
