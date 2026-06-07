package graph;
import java.util.*;
import java.io.*;
public class largestregion {
    static int max_size=0;
    public static void largest(int arr[][],boolean visited[][]){
     
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]==1 && !visited[i][j]){
                int size=dfs(arr,visited,i,j);
                max_size=Math.max(size,max_size);

            }
        }
      }




    }
    public static int dfs(int arr[][],boolean visited[][],int row,int col){
      int directions[][]={{-1,-1},{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1}};
      visited[row][col]=true;
      int size=1;
      for(int dir[]: directions){
        int rowc=dir[0];
        int colc=dir[1];
        int uprow=rowc+row;
        int upcol=col+colc;
        if(uprow<arr.length && uprow >=0 && upcol<arr[0].length && upcol>=0 && !visited[uprow][upcol] && arr[uprow][upcol]==1){
        size=size+dfs(arr, visited, uprow, upcol);
        }

      }
      return size;





    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the total number of rows");
        int rows=Integer.parseInt(obj.readLine());
        System.out.println("enter the total number of column:");
        int col=Integer.parseInt(obj.readLine());
        int arr[][]=new int[rows][col];
        boolean vis[][]=new boolean[rows][col];
       for(int i=0;i<vis.length;i++){
        for(int j=0;j<vis[i].length;j++){
            vis[i][j]=false;
        }
       }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=Integer.parseInt(obj.readLine());
            }
        }
        largest(arr, vis);
        System.out.println("size of the max_region is :"+max_size);

    }
    
}
