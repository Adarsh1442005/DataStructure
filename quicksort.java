import java.util.*;
import java.io.*;
public class quicksort {
    public static void sort(int arr[],int stindex,int endindex){
        if(stindex>=endindex){
            return;
        }
        int pivot=arr[endindex];
        int i=stindex-1;
        for(int j=stindex;j<endindex;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }

        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[endindex]=temp;
        sort(arr,stindex,i-1);
        sort(arr,i+1,endindex);




    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array");
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
        System.out.println("array after the sorting");
        sort(arr, 0, arr.length-1);
        for(int i:arr){
            System.out.print(i+",");
        }

    }
    
}
