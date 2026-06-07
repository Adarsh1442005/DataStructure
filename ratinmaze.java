import java.util.*;
import java.io.*;

public class ratinmaze {
    public static int maze(int maze[][], int row, int col) {

        if (row == maze.length - 1 && col == maze[row].length - 1) {

            return 1;
        }
        if (col == maze[row].length) {

            return 0;

        }
        if (maze[row][col] == 0) {
            return 0;
        }
        maze[row][col] = 0;

        int right = 0;
        int left = 0;
        int down = 0;
        int up = 0;
        if (row == 0 || row == maze.length - 1) {

            right = maze(maze, row, col + 1);

            if (row == 0) {

                down = maze(maze, row + 1, col);

            } else {
                up = maze(maze, row - 1, col);

            }
            if (col != 0) {
                left = maze(maze, row, col - 1);

            }
            maze[row][col] = 1;
            return left + right + up + down;

        }

        right = maze(maze, row, col + 1);
        up = maze(maze, row - 1, col);
        down = maze(maze, row + 1, col);
        if (col != 0) {

            left = maze(maze, row, col - 1);
        }
        maze[row][col] = 1;
        return left + right + up + down;

    }

    public static void main(String args[]) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of rows :");
        int rows = Integer.parseInt(obj.readLine());
        System.out.println("enter the number of column");
        int col = Integer.parseInt(obj.readLine());
        int maze[][] = new int[rows][col];
        System.out.println("fill the cells");
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                maze[i][j] = Integer.parseInt(obj.readLine());
            }
            System.out.println("enter the next rows");

        }
        int totalways = maze(maze, 0, 0);
        System.out.println("total number of ways are:" + totalways);
        System.out.println("the values in the cells are");
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j]);
            }
            System.out.println("");
        }

    }
}
