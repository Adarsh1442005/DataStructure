import java.util.*;
import java.io.*;
public class kadhansalgo {
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array");
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int[size];
        System.out.println("enter the elements in the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<arr.length;i++){
            currsum=currsum+arr[i];
            if(currsum<0){
                if(currsum>maxsum){
                    maxsum=currsum;
                
                }
                currsum=0;
                
            }
            else{
                if(currsum>maxsum){
                    maxsum=currsum;
                }
            }
        
        }
        System.out.println("max subarray sum is:"+maxsum);


    }
    
}
