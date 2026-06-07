import java.util.*;
import java.io.*;
public class gridways {
    public static int grid(int row,int col, int arr[][]){
        if(row==arr.length-1 && col==arr[row].length-1){
            return 1;
        }
        if(col==arr[row].length-1){
            int way=grid(row+1,col,arr);
            return way;
        }
        if(row==arr.length-1){
           int way= grid(row,col+1,arr);
           return way;

        }
        int right=grid(row,col+1,arr);
        int down=grid(row+1,col,arr);
        int total=right+down;
        return total;



    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of rows");
        int row=Integer.parseInt(obj.readLine());
        System.out.println("enter the number of column:");
        int col=Integer.parseInt(obj.readLine());
        int arr[][]=new int [row][col];
        int total_ways=grid(0,0,arr);
        System.out.println("totla number of ways are:"+total_ways);
        
        


    }
    
}
