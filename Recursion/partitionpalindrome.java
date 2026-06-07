package Recursion;

import java.util.*;
import java.io.*;

public class partitionpalindrome {
    static ArrayList<ArrayList<String>> stra = new ArrayList<>();

    public static void partition(String s, int index, ArrayList<String> arr) {
        if (index >= s.length()) {
            ArrayList<String> arr2 = new ArrayList<>();
            for (String str : arr) {
                arr2.add(str);
            }
            stra.add(arr2);
        }

        for (int i = index; i < s.length(); i++) {
            if (ispalindrome(s, index, i)) {
                arr.add(s.substring(index, i + 1));
                partition(s, i + 1, arr);
                arr.remove(arr.size() - 1);

            }
        }

    }

    public static void main(String args[]) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the string");
        String a = obj.readLine();
        ArrayList<String> arr=new ArrayList<>();
        partition(a,0,arr);
        System.out.println(stra);

    }

    public static boolean ispalindrome(String s, int i, int j) {
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;

    }

}
