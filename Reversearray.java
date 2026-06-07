import java.util.*;
import java.io.*;
public class Reversearray {
    public static void reverse(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            
            int sw=arr[start];
            arr[start]=arr[end];
            arr[end]=sw;
            start=start+1;
            end=end-1;
        }
      
    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
        System.out.println("array before reversing");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");

        }
        System.out.println("\n array after reversing");
        reverse(arr);
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+",");
       }
    



    }
    
}
