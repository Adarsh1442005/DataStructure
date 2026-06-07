import java.util.*;
import java.io.*;
public class Binarysearch {
    public static int binary(int arr[],int element){
         int start=0;
         int end=arr.length-1;
         while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==element){
                return mid;
            }
            else if(arr[mid]<element){
              start=mid+1;
              continue;
            }
            end=mid-1;
         }
         return -1;




    }
    public static void main(String arg[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array");
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
        System.out.println("enter the number you want to search");
        int element=Integer.parseInt(obj.readLine());
       int val= binary(arr,element);
       if(val<0){
        System.out.println("element not found");
        return;
       }
       System.out.println("element found at index"+val);



    }
    
}
