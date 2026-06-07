package arrayrevision;
import java.util.*;
import java.io.*;


public class trappedrainwater {
    static int left[];
    static int right[];
    public static void lefrig(int arr[]){
     left[0]=arr[0];
     right[right.length-1]=arr[arr.length-1];
     for(int i=1;i<arr.length;i++){
        if(arr[i]>left[i-1]){
            left[i]=arr[i];
        }
        else{
            left[i]=left[i-1];

        }
     }
     for(int i=arr.length-2;i>=0;i--){
        if(arr[i]>right[i+1]){
            right[i]=arr[i];
        }
        else{
            right[i]=right[i+1];
        }
     }

    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array");
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());

        }
        left=new int[arr.length];
        right=new int[arr.length];
        lefrig(arr);
        int trap=0;
        for(int i=0;i<arr.length;i++){
            int height=Math.min(left[i],right[i]);
            int water=(height-arr[i]);
            if(water>0){
                trap=trap+water;
            }
        }
        System.out.println("the trapped water is:"+trap);

        
    }
    
}
