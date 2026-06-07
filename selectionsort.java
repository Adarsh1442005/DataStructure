import java.util.*;
import java.io.*;
public class selectionsort {
    public static void select(int arr[]){
       int start=0;
       int end=arr.length-1;
       int min=arr[start];
       int index=start;

       while(start!=end){
       for(int i=start;i<=end;i++){
            if(arr[i]<min){
                min=arr[i];
                index=i;
            }
       }
       if(index!=start){
        int temp=arr[start];
        arr[start]=arr[index];
        arr[index]=temp;
       }
       start=start+1;
       min=arr[start];
       index=start;

       

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
        select(arr);
        for(int i:arr){
            System.out.print(i+",");
        }

    }
    
    
}
