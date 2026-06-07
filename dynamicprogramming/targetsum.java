package dynamicprogramming;
import java.util.*;
import java.io.*;
public class targetsum {
    public static boolean target(int numbers[],int target){
      boolean dp[][]=new boolean[numbers.length+1][target+1];
      for(int i=0;i<dp.length;i++){
        dp[i][0]=true;
      }
      for(int i=1;i<dp[0].length;i++){
         dp[dp.length-1][i]=false;
      }
      for(int i=dp.length-2;i>=0;i--){
        for(int j=1;j<dp[i].length;j++){
            if(numbers[i]<=j){
                boolean ans1=dp[i+1][j-numbers[i]];
                boolean ans2=dp[i+1][j];
                dp[i][j]=ans1||ans2;
            }
        }
      }


    return dp[0][target];


    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the arrays");
        int size=Integer.parseInt(obj.readLine());
        int numbers[]=new int[size];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=Integer.parseInt(obj.readLine());
        }
        System.out.println("enter the target sum");
        int target=Integer.parseInt(obj.readLine());
        if(target(numbers, target)){
            System.out.println("target sum exist:");
            return;
        }
        System.out.println("target sum does not exist:");


    }
    
}
