import java.util.*;
import java.io.*;
public class buystock {
    public static int  besttime(int stock[]){
         
       int profit=0;
       int buyprice=stock[0];
       for(int i=1;i<stock.length;i++){
        if(stock[i]>buyprice){
            profit=Math.max(profit,(stock[i]-buyprice));
        }
        else{
            buyprice=stock[i];
        }
       }
        return profit;

    }
   public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array");
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
        System.out.println("the maximum profit we get will be:"+besttime(arr));

   }
    
}
