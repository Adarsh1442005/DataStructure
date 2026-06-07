import java.util.*;
import java.io.*;
public class searchrotatedarray {
    public static int search(int arr[],int st_index,int end_index,int target){
        if(st_index>=end_index){
            return -1;
        }
        int mid=(st_index+end_index)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>arr[st_index]){
              if(arr[st_index]<=target && target<=arr[mid]){
                    int ind =search(arr,st_index,mid,target);
                     return ind;
              }
              else{
               int ind= search(arr,mid,end_index,target);
                return ind;
              }
        }
        else if(arr[mid]<arr[end_index]){
            if(target>arr[mid] && target<=arr[end_index]){
                int ind=search(arr,mid,end_index,target);
                return ind;
            }
            else{
                int ind=search(arr,st_index,mid,target);
                return ind;
            }



        }
        return -1;



    }
    public static void main(String args[]) throws IOException{
     BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("enter the sizeof the array");
     int size=Integer.parseInt(obj.readLine());
     int arr[]=new int[size];
     System.out.println("enter the elements in the array");
     for(int i=0;i<arr.length;i++){
        arr[i]=Integer.parseInt(obj.readLine());
     }
     int index=search(arr, 0, arr.length-1, 0);
    if(index==-1 ){
        System.out.println("element not found at anny index");
        
    }
    else{
        System.out.println("element found at index : "+index);
        
    }





    }
    
}
