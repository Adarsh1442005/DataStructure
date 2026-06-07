package dynamicprogramming;
import java.util.*;
import java.io.*;

public class minimum_part {
    public static void min_array(int arr[]){
        int dp[]=new int[arr.length];
        Arrays.fill(dp,-1);
        dp[dp.length-1]=0;
        
        for(int j=dp.length-2;j>=0;j--){
            int steps=arr[j];
            int ans=Integer.MAX_VALUE;
            for(int i=1;i<=steps;i++){
            if((j+i)>=dp.length){
                 break;
            }
                if(dp[j+i]!=-1){
                ans=Math.min(ans,dp[j+i]+1);
                }
            }
            if(ans!=Integer.MAX_VALUE){
                dp[j]=ans;
            }
        }
        System.out.println("minimum steps required to reach the destination:"+dp[0]);




    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array:");
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
        min_array(arr);
        
    }
    
}
