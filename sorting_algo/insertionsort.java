package sorting_algo;
import java.util.*;
import java.io.*;

public class insertionsort {
    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int j=i;
            int temp=arr[j];
            j--;
            while(j>=0){
                if(arr[j]>temp){
                    arr[j+1]=arr[j];
                    j--;
                }
                else{
                    arr[j+1]=temp;
                    break;
                }
            }
            if(j<0){
                arr[j+1]=temp;
            }
        }

    }
    public static void main(String args[]) throws IOException{
      BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));  
      System.out.println("enter the size of the array");
      int size=Integer.parseInt(obj.readLine());
      int arr[]=new int[size];
      for(int i=0;i<arr.length;i++){
        arr[i]=Integer.parseInt(obj.readLine());
      }
      insertion(arr);
      Printarr.pr(arr);




    }
    
}
