package dynamicprogramming;
import java.util.*;
import java.io.*;

public class matrixchain {
    static int dp[][];
    public static int  matrix_chain(int arr[],int i,int j){
     if(i==j){
       return 0;

     }
     if(dp[i][j]!=Integer.MAX_VALUE){
        return dp[i][j];
     }
     int ans=Integer.MAX_VALUE;
     for(int k=i;k<j;k++){
        int cost1=matrix_chain(arr,i,k);
        int cost2=matrix_chain(arr,k+1,j);
        int curr=arr[i-1]*(arr[k]*arr[j]);
        ans=Math.min(ans,cost1+cost2+curr);

     }
     dp[i][j]=ans;
     return dp[i][j];







    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array");
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
        dp=new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                dp[i][j]=Integer.MAX_VALUE;
            }
        }
      int ans=  matrix_chain(arr, 1, 4);
      System.out.println(ans);



    }
    
}
