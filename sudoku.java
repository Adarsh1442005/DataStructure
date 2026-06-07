import java.util.*;
import java.io.*;

public class sudoku {
    public static boolean isSafe(int grid[][], int row, int col, int digit) {
        for (int i = 0; i < 9; i++) {
            if (grid[row][i] == digit) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (grid[i][col] == digit) {
                return false;
            }
        }
        int st_row = (row / 3) * 3;
        int st_col = (col / 3) * 3;
        for (int i = st_row; i < st_row + 3; i++) {
            for (int j = st_col; j < st_col + 3; j++) {
                if (grid[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;

    }

    public static boolean sudoku(int row, int col, int grid[][]) {
        if (row == grid.length) {
            return true;
        }
        if (grid[row][col] != 0) {
            if (col == grid[row].length - 1) {
                if (sudoku(row + 1, 0, grid)) {
                    return true;
                }

            } else {
                if (sudoku(row, col + 1, grid)) {
                    return true;
                }
            }
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(grid, row, col, i)) {
                    grid[row][col] = i;
                    if (col == grid[row].length - 1) {
                        if (sudoku(row + 1, 0, grid)) {
                            return true;
                        }
                    } else if (sudoku(row, col + 1, grid)) {
                        return true;

                    }
                    grid[row][col] = 0;

                }

            }
        }
        return false;

    }

    public static void main(String args[]) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of rows :");
        int rows = Integer.parseInt(obj.readLine());
        System.out.println("enter tje numbe rof column:");
        int col = Integer.parseInt(obj.readLine());
        int grid[][] = new int[rows][col];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = Integer.parseInt(obj.readLine());
            }
            System.out.println("nexrt row:");
        }
        if (sudoku(0, 0, grid)) {
            System.out.println("yes the solution exist");
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(grid[i][j] + ",");
                }
                System.out.println("");
            }

        } else {
            System.out.println("no solution does not exist");

        }

    }

}
