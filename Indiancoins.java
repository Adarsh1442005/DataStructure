import java.util.*;
import java.io.*;

public class Indiancoins {
    public static int denom(int coins[],int value){
         Arrays.sort(coins);
        int valc=value;
    int count=0;
    for(int i=coins.length-1;i>=0;i--){
        while(coins[i]<=valc){
            valc=valc-coins[i];
            count++;
        }
    }
    return count;
    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of coins");
        int size=Integer.parseInt(obj.readLine());
        int coins[]=new int[size];
        System.out.println("enter the value");
        int val=Integer.parseInt(obj.readLine());
        System.out.println("enter the coin values");
        for(int i=0;i<coins.length;i++){
           coins[i]=Integer.parseInt(obj.readLine());
        }

       int count= denom(coins, val);
       System.out.println("maximum number of coins needed is :"+count);

    }
    
}
