package sorting_algo;
import java.util.*;
import java.io.*;
 class Printarr{
    public static void pr(int arr[]){
        System.out.println("");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

}

public class selection {
    
    public static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }






    }
    public static void main (String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array");
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());

        }
        selection(arr);
        System.out.println("");
        Printarr.pr(arr);


    }
    
}
