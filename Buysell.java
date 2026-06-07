import java.util.*;
import java.io.*;
public class Buysell {
    public static int calculate(int stock[]){
        int buyprice=stock[0];
        int maxprofit=0;
        for(int i=1;i<stock.length;i++){
            if(stock[i]>buyprice){
               int profit=stock[i]-buyprice;
               if(profit>maxprofit){
                maxprofit=profit;
               }
            }
            else{
                buyprice=stock[i];
            }
        }
        return maxprofit;



    }
    public static void main(String args[]) throws IOException{
BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ënter the size of the array");
int size=Integer.parseInt(obj.readLine());
int arr[]=new int[size];
System.out.println("enter the elements of the array");
for(int i=0;i<arr.length;i++){
    arr[i]=Integer.parseInt(obj.readLine());
}
System.out.println("the maximum profit we can achieve will be"+calculate(arr));




    }
    
}
