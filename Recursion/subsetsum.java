package Recursion;
import java.util.*;
import java.io.*;
public class subsetsum {
    static ArrayList<Integer> li=new ArrayList<>();
    public static void subset(int arr[],int index,int sum){
        if(index>=arr.length){
            li.add(sum);
            return;
        }
        // pick
        subset(arr,index+1,sum+arr[index]);
        // not pick
        subset(arr,index+1,sum);


    }
    public static void main(String args[]) throws IOException{
          BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("enter the size of the array");
          int size=Integer.parseInt(obj.readLine());
          int arr[]=new int[size];
          for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
          }
          subset(arr,0,0);
          Collections.sort(li);
          System.out.println("all subset sum is:");
          System.out.println(li);
    }
    
}
