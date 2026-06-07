package HashMap;

import java.util.*;
import java.io.*;

public class twosum {
    public static int[] twosum(int arr[], int target) {
        int ans[] = new int[2];
        HashMap<Integer, ArrayList<Integer>> map1 = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            if (map1.containsKey(arr[i])) {
                ArrayList<Integer> ar = map1.get(arr[i]);
                ar.add(i);

            } else {
                ArrayList<Integer> ar = new ArrayList();
                ar.add(i);

                map1.put(arr[i], ar);
            }

        }

        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        }
        int targetc = target;
        for (int i = 0; i < arr.length; i++) {
            targetc = targetc - arr[i];
            if (map.containsKey(targetc)) {
                if (targetc == arr[i]) {
                    if (map.get(targetc) > 1) {
                        ArrayList<Integer> ar = map1.get(arr[i]);
                        ans[0] = ar.get(0);
                        ans[1] = ar.get(1);

                    }

                } else {
                    ans[0] = i;
                    ans[1] = map1.get(targetc).get(0);
                    return ans;
                }
            }
            targetc = target;

        }
        return ans;

    }

    public static void main(String args[]) throws IOException {

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of tha array:");
        int size = Integer.parseInt(obj.readLine());
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(obj.readLine());
        }
        System.out.println("enter the target");
        int target = Integer.parseInt(obj.readLine());
        int is[] = twosum(arr, target);
        System.out.println(is.length + "," + is[0] + "," + is[1]);

    }

}
