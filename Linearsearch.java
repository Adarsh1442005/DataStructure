import java.util.*;
import java.io.*;
public class Linearsearch {
    public static int linearsearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        
        }
        return -1;

    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array");
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
        System.out.println("enter the key");
        int key=Integer.parseInt(obj.readLine());
      int ret=  linearsearch(arr,key);
      if(ret<0){
        System.out.println("element not found at any of the index");
      }
      else{
        System.out.println("element found at index"+ret);
      }



    }
    
}
