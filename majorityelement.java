import java.util.*;
import java.io.*;
public class majorityelement {
    public static int  majority(int arr[],int start_indx,int end_indx){
        if(start_indx==end_indx){
            return arr[start_indx];
        }
        int mid=(start_indx+end_indx)/2;
        int left=majority(arr, start_indx, mid);
        int right=majority(arr,mid+1,end_indx);
        if(left==right){
            return left;
        }
        int leftcount=count(arr,left,start_indx,end_indx);
        int rightcount=count(arr,right,start_indx,end_indx);
        return leftcount>rightcount?left:right;


    }
    public static int count(int arr[],int num,int low,int high){
        int count=0;
        for(int i=low;i<=high;i++){
            if(arr[i]==num){
                count++;
            }
        }
        return count;




    }
    public static void main (String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array");
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
       int majority= majority(arr,0,arr.length-1);
       System.out.println("majority element is :"+majority);

        }
    
}
