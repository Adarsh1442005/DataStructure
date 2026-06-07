package dynamicprogramming;
import java.util.*;
import java.io.*;


public class unbound_knapsack {
    public static void knapsack(int wt[],int val[],int capacity){
        int dp[][]=new int[wt.length+1][capacity+1];
        for(int i=0;i<dp[0].length;i++){
            dp[dp.length-1][i]=0;
        }
        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;
        }

        for(int i=dp.length-2;i>=0;i--){
            for(int j=1;j<dp[0].length;j++){
                if(wt[i]<=j){
                    int ans1=val[i]+dp[i][j-wt[i]];
                    int ans2=dp[i+1][j];
                    dp[i][j]=Math.max(ans1,ans2);
                }
                else{
                    dp[i][j]=dp[i+1][j];
                }
            }
        }
        System.out.println("maximum profit is :"+dp[0][capacity]);






    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the total numb er of items:");
        int item=Integer.parseInt(obj.readLine());
        int wt[]=new int[item];
        System.out.println("ente rthe weights  of the item:");
        for(int i=0;i<item;i++){
            wt[i]=Integer.parseInt(obj.readLine());
        }
        int val[]=new int[item];
        System.out.println("enter the values of the item");
        for(int i=0;i<item;i++){
            val[i]=Integer.parseInt(obj.readLine());
        }
        System.out.println("enter the capacity");
        int capacity=Integer.parseInt(obj.readLine());
        knapsack(wt, val, capacity);

    }
    
}
