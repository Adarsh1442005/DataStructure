import java.util.*;
import java.io.*;
public class Assignment20_1 {
    public static void indices(int arr[],int index,int key){
       if(index==arr.length-1){
        if(arr[index]==key){
            System.out.print(index+",");
            
        }
        return;

       }
       if(arr[index]==key){
        System.out.println(index+",");
       }
       indices(arr,index+1,key);


    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array");
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
        System.out.println("enter the key element");
        int key=Integer.parseInt(obj.readLine());
        indices(arr, 0, key);



    }
    
}
