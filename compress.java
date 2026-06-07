import java.util.*;
import java.io.*;

public class compress {
    public static void main(String ars[]) throws IOException {
        System.out.println("enter the string:");
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        String str = obj.readLine();
        StringBuilder ans = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            int count = 1;
            i++;
            while (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
                i++;

            }
            if (count > 1) {
                ans.append(a);
                char b = (char) (count + '0');
                ans.append(b);

            } else {
                ans.append(a);

            }
            i--;

        }
        System.out.println(ans);

    }

}