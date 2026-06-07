import java.util.*;
import java.io.*;
public class splitkaub {
    public static boolean valid(int mid,int arr[],int k){
              int count=0;
              int sum=0;
              for(int i=0;i<arr.length;i++){
                sum=sum+arr[i];
                if(sum>mid){
                    count++;
                    sum=arr[i];
                }

              }   
              if(count<=k){
                return true;
              }
              return false;


    }
    public  static  int split(int arr[],int k){
        int sum=0;
        for(int i=0;i<arr.length;i++){
                sum=sum+arr[i];
        }  
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        } 
        int low=max;
        int high=sum;   
        
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(valid(mid,arr,k)){
                ans=mid;
                high=mid-1;


            }
            else{
                low=mid+1;
            }
        } 
        return ans;    




    }
    public static void main(String args[]) throws IOException{
         BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("enter the size of the array");
         int size=Integer.parseInt(obj.readLine());
         int arr[]=new int[size];
         for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
         }
         System.out.println("enter the number K:");
         int k=Integer.parseInt(obj.readLine());
         System.out.println("minimum sum is:"+split(arr, k));
    }
}
