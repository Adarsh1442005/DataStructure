package Backtracking;
import java.util.*;
import java.io.*;

public class subset {
    public static void subset(int arr[],String s,int index){
    if(index>=arr.length){
        System.out.println(s);
        return;
    }
    // include character
    String s1=s+Integer.toString(arr[index])+",";
    subset(arr,s1,index+1);
    //dont include
    subset(arr,s,index+1);



    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the lenght of the array");
        int length=Integer.parseInt(obj.readLine());
        int arr[]=new int[length];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
        subset(arr,"",0);
        System.out.println("null");
    }
    
}
