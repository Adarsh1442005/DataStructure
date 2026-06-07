package Heap;
import java.util.*;
import java.io.*;


public class heapdsort {
    public static void heapify(int arr[],int i,int size){
      int maxindex=i;
      int left=2*maxindex+1;
      int right=2*maxindex+2;
      if(left<size &&(arr[left]<arr[maxindex])){
        maxindex=left;
      }
      if(right<size &&(arr[right]<arr[maxindex])){
        maxindex=right;
      }
      if(maxindex!=i){
        int temp=arr[maxindex];
        arr[maxindex]=arr[i];
        arr[i]=temp;
        heapify(arr,maxindex,size);

      }




    }
    private  static void sort(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            int temp=arr[0];
           arr[0]= arr[i];
           arr[i]=temp;
           heapify(arr,0,i);
        }




    }
    public static void maxheap(int arr[]){
     int n=arr.length;
     for(int i=n/2;i>=0;i--){
        heapify(arr,i,n);
     }
     sort(arr);



    }
    public static void main(String args[])  throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array");
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
        maxheap(arr);
        System.out.println("array after sorting will be:");
        for(int i:arr){
            System.out.println(i);
        }


    }
    
}
