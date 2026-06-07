package arrayrevision;
import java.util.*;
import java.io.*;

public class rotated {
    public static int search(int arr[],int target){
      int low=0;
      int high=arr.length-1;
      while(low<=high){
        int mid=(low+high)/2;
        if(arr[mid]==target){
           return mid;
        }
        else if(arr[low]<=arr[mid]){
            if(target>=arr[low] && target<=arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        else{
            if(target>arr[mid] && target<=arr[high]){
            low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
      }

       return -1;


    }

    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" enter the size of the rotated array:");
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
        System.out.println("enter the target value");
        int target=Integer.parseInt(obj.readLine());
        int ans=search(arr,target);
        if(ans==-1){
            System.out.println("the target not found");
        }
        else{
            System.out.println("the target value fount at index:"+ans);
        }

        
    }
    
}
