import java.util.*;
import java.io.*;
public class Backtracking {
    public static void backtracarray(int arr[],int val,int index){
      if(index==arr.length-1){
        arr[index]=val-2;
        return;
        

      }
      arr[index]=val;
      backtracarray(arr,val+1,index+1);
      arr[index]=arr[index]-2;


    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array");
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int[size];
        backtracarray(arr,1,0);
        for(int i:arr){
            System.out.println(i);
        }

    }
    
}
