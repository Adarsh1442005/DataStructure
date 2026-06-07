package arrayrevision;
import java.util.*;
import java.io.*;
public class khadansalgo {
    public static void main(String args[])  throws IOException{
       BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("enter the size of the array");
       int size=Integer.parseInt(obj.readLine());
       int arr[]=new int[size];
       System.out.println("enter the elements in  the array:");
       for(int i=0;i<arr.length;i++){
        arr[i]=Integer.parseInt(obj.readLine());
       }
       int curr_sum=0;
       int max_sum=curr_sum;
       for(int i=0;i<arr.length;i++){
        curr_sum=curr_sum+arr[i];
        if(curr_sum<0){
            curr_sum=0;
        }
        else{
            if(curr_sum>max_sum){
                max_sum=curr_sum;
            }
        }
       }
       System.out.println("the max_sum is :"+max_sum);

    }
    
}
