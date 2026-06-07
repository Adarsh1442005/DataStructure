import java.util.*;
import java.io.*;
public class searchin_sorted_2d {
    static  int key_row=-1;
    static  int key_col=-1;
    public static void search(int arr[][],int key){
        int start_row=0;
        int start_col=arr[0].length-1;
        int element=arr[start_row][start_col];
       
        while(start_row<=(arr.length-1) && start_col>=0 ){
           if(key>element){
            start_row=start_row+1;
           }
           else if(key<element){
             start_col=start_col-1;
           }
           if(key==element){
            key_row=start_row;
            key_col=start_col;
            break;
           }
           element=arr[start_row][start_col];


        }


    }
    public static void main(String args[]) throws IOException{
      BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("enter the number of rows");
      int rows=Integer.parseInt(obj.readLine());
      System.out.println("enter the number of column");
      int col=Integer.parseInt(obj.readLine());
      int arr[][]=new int[rows][col];
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]=Integer.parseInt(obj.readLine());
        }
      }
      System.out.println("enter the key element:");
      int key=Integer.parseInt(obj.readLine());
      search(arr,key);
      if(key_row==-1 || key_col==-1){
        System.out.println("there will be no any key exist");
        return;
      }
      System.out.println("element found at row: "+key_row+"and column: "+key_col);




    }
    
}
