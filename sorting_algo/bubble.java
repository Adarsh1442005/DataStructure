package sorting_algo;
import java.util.*;
import java.io.*;


public class bubble {
    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int num=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=num;
                }
            }
        }

    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array:  ");
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int[size];
        System.out.println("enter the elements in the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
        sort(arr);
        System.out.println("array after sorting is:");
        Printarr.pr(arr);
       





    }
    
}
