import java.util.*;
import java.io.*;
public class Bubblesort {
    public static void bubblesort(int arr[]){
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length-i-1;j++){
          if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
          }
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
       bubblesort(arr);
       for(int i:arr){
        System.out.print(i+",");
       }


    }
    
}

