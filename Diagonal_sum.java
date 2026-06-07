import java.util.*;
import java.io.*;
public class Diagonal_sum {

    public static int diagonal_sum(int arr[][]){
     int sum_a=0;
     for(int i=0;i<arr.length;i++){
        sum_a=sum_a+arr[i][i];
     }
     int sum_b=0;
     int row=0;
     for(int i=arr[0].length-1;i>=0;i--){
        if(i==row){
           
            row++;
            continue;
        }
        sum_b=sum_b+arr[row][i];
        row++;
     }
     return sum_b+sum_a;


    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of rows of the array");
        int rows=Integer.parseInt(obj.readLine());
        System.out.println("enter the number of column");
        int col=Integer.parseInt(obj.readLine());
        int arr[][]=new int[rows][col];
        System.out.println("enter the elements in the array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=Integer.parseInt(obj.readLine());
            }
        }
        System.out.println("the sum of the both diagonals is:"+diagonal_sum(arr));
        



    }
    
}
