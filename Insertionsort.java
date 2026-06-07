import java.util.*;
import java.io.*;
public class Insertionsort {
    public static void insert(int arr[]){
      int start=1;
      int index=start;
      while(start<arr.length){
        int temp=arr[start];
         for(int i=start-1;i>=0;i--){
            if(arr[i]>temp){
                arr[index]=arr[i];
                index--;

            }
            else{
                
                break;
            }
         }
         arr[index]=temp;
         start=start+1;
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
        insert(arr);
        for(int i:arr){
            System.out.print(i+",");
        }




    }
    
}
