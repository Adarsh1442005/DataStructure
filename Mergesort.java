import java.util.*;
import java.io.*;
public class Mergesort {
    public static void divide(int arr[],int start_indx,int end_indx){
        if(start_indx>=end_indx){
            return;
        }
        int mid=(start_indx+end_indx)/2;
        divide(arr,start_indx,mid);
        divide(arr,mid+1,end_indx);
        merge(arr,start_indx,mid,end_indx);



    }
    public static void merge(int arr[],int low,int mid,int high){
        int merged_arr[]=new int[(high-low)+1];
        int j=0;
        int low_c=low;
        int mid_1c=mid+1;
        while(low_c<mid+1 && mid_1c<high+1){
            if(arr[low_c]<arr[mid_1c]){
                merged_arr[j]=arr[low_c];
                j++;
                low_c++;

            }
            else{
                merged_arr[j]=arr[mid_1c];
                mid_1c++;
                j++;
            }
        }
        while(low_c<mid+1){
            merged_arr[j]=arr[low_c];
            low_c++;
            j++;

        }
         while(mid_1c<high+1){
            merged_arr[j]=arr[mid_1c];
            mid_1c++;
            j++;
            
        }
        j=0;
        while(j<merged_arr.length){
            arr[low]=merged_arr[j];
            low++;
            j++;

        }

    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array");
        int size=Integer.parseInt(obj.readLine());
        System.out.println("enter the elements of the  array");
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
          arr[i]=Integer.parseInt(obj.readLine());
        }
        divide(arr, 0, arr.length-1);
        System.out.println("array after the sorting is");
        for(int i:arr){
            System.out.println(i);
        }

    }
    
}
