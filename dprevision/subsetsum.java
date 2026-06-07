package dprevision;
import java.util.*;
import java.io.*;

public class subsetsum {
    static int arr[];
    static int dp[][];
    public static int max(int target,int index){
        
        if(target==0){
            return 1;
        }
        if(index>=arr.length){
            return 0;
        }
        if(target<0){
            return 0;
        }
        if(dp[index][target]!=-1){
            return dp[index][target];
        }
        int consist=max(target-arr[index],index+1);
        int notconsist=max(target,index+1);
        if(consist==1 || notconsist==1){
            dp[index][target]=1;
        }
        else{
            dp[index][target]=0;
        }
        return dp[index][target];


        


    }
    
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array");
        int size=Integer.parseInt(obj.readLine());
        arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
        System.out.println("enter the target");
        int target=Integer.parseInt(obj.readLine());
        dp=new int[size][target+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        if(max(target,0)==1){
            System.out.println( "the target sum exist:" );
            return;

        }
        System.out.println( "the target sum not exist:");

      
        

        

    }
    
}
