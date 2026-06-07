import java.util.*;
import java.io.*;

public class containerwater {
    public static int trap(ArrayList<Integer> height) {
        int i = 0;
        int j = height.size() - 1;
        int area = 0;
        while (i < j) {
            int length = Math.min(height.get(i), height.get(j));
            int width = j - i;
            int newarea = length * width;
            if (newarea > area) {
                area = newarea;

            }
            if (height.get(i) > height.get(j)) {
                j--;
            } else {
                i++;
            }

        }

        return area;

    }

    public static void main(String args[]) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the total number of the bar");
        int num = Integer.parseInt(obj.readLine());
        ArrayList<Integer> arr = new ArrayList();
        for (int i = 0; i < num; i++) {
            arr.add(Integer.parseInt(obj.readLine()));
        }
        System.out.println("maximum water trapped is :" + trap(arr));

    }

}