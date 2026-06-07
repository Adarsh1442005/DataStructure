package dynamicprogramming;
import java.util.*;
import java.io.*;

public class  minimum_partitioning{
    public static void part(int arr[],int cap,int sum){

     int dp[][]=new int[arr.length+1][cap+1];
     for(int i=dp.length-2;i>=0;i--){
        for(int j=dp[i].length-1;j>=0;j--){
            if(arr[i]<=j){
                int ans1=arr[i]+dp[i+1][j-arr[i]];
                int ans2=dp[i+1][j];
                dp[i][j]=Math.max(ans1, ans2);
            }
        }
     }
     int remain=sum-dp[0][dp[0].length-1];
     int min=Math.abs(remain-dp[0][dp[0].length-1]);
     System.out.println("minimum difference is :"+min);


    }
    public static void minimum(int arr[]){
    int sum=0;
    for(int i=0;i<arr.length;i++){
     sum=sum+arr[i];
    }
    int half_sum=sum/2;
    part(arr,half_sum,sum);
    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array:");
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());

        }
        minimum(arr);

    }

}