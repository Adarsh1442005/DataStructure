import java.util.*;
import java.io.*;

public class spiralmatrix {
    public static void spiral(int arr[][], int start_row, int start_col, int end_row, int end_col) {
        if (end_col <= start_col) {
            return;
        }
        if (start_row >= end_row) {
            return;
        }
        for (int i = start_col; i <= end_col; i++) {
            System.out.print(arr[start_row][i] + ",");
        }
        for (int i = start_row + 1; i <= end_row; i++) {
            System.out.print(arr[i][end_col] + ",");
        }
        for (int i = end_col - 1; i >= start_col; i--) {
            System.out.print(arr[end_row][i] + ",");

        }
        for (int i = end_row - 1; i >= (start_row + 1); i--) {
            System.out.print(arr[i][start_col] + ",");
        }
        spiral(arr, start_row + 1, start_col + 1, end_row - 1, end_col - 1);

    }

    public static void main(String args[]) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number  of rows in the array");
        int rows = Integer.parseInt(obj.readLine());
        System.out.println("enter the number of the column");
        int col = Integer.parseInt(obj.readLine());
        int arr[][] = new int[rows][col];
        System.out.println("enter the elements in the array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(obj.readLine());

            }
        }
        spiral(arr, 0, 0, arr.length - 1, arr[0].length - 1);

    }

}
