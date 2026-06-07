package Heap;
import java.util.*;
import java.io.*;


public class minoperation {
    public static int halfsum(int arr[]){
    PriorityQueue<Integer> qu=new PriorityQueue(Collections.reverseOrder());
    int sum=0;
    for(int i:arr){
        qu.add(i);
        sum=sum+i;
    }
    int target=sum/2;
    int operation=0;
    while(sum>target){
        int elem=qu.poll();
        sum=sum-(elem/2);
        qu.add(elem/2);
        operation++;

    }
    return operation;







    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array");
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
        System.out.println("minimum number of operation required is:"+halfsum(arr));




    }
    
}
