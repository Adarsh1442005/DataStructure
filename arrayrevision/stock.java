package arrayrevision;
import java.util.*;
import java.io.*;

public class stock {
    public static int stock(int arr[]){
        int cost=Integer.MAX_VALUE;
        int profit=0;
        
     for(int i=0;i<arr.length;i++){
       if(arr[i]<cost){
         cost=arr[i];
       }
       else{
        int prof=arr[i]-cost;
        if(prof>profit){
            profit=prof;
        }
       }
     }
     return profit;
    }
    public static void main(String args[]) throws IOException{
       BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("ente the size of the array");
       int size=Integer.parseInt(obj.readLine());
       int arr[]=new int[size];
       for(int i=0;i<arr.length;i++){
        arr[i]=Integer.parseInt(obj.readLine());
       }
       int ans=stock(arr);
       System.out.println("max profit is :"+ans)
;

    }
    
}
