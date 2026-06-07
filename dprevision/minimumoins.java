package dprevision;
import java.util.*;
import java.io.*;

public class minimumoins{
    static int coins[];
    static int dp[][];
    public static int  minimum(int index,int target){
        if(target==0){
            return 0;
        }
        if(index>=coins.length){
            return Integer.MAX_VALUE-1;
        }
        if(target<0){
            return Integer.MAX_VALUE-1;
        }
        if(dp[index][target]!=-1){
            return dp[index][target];

        }
        int take=1+minimum(index,target-coins[index]);
        int nottake=minimum(index+1,target);
        dp[index][target]=Math.min(take,nottake);
        return dp[index][target];


    }

    
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array");
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
        System.out.println("enter the target");
        int target=Integer.parseInt(obj.readLine());
        coins=arr;
        dp=new int[size][target+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println("minimum number of coins required:"+minimum(0,target));
    }

}
