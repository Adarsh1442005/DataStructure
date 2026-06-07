package Recursion;
import java.util.*;
import java.io.*;

public class fibonnaci {
    static int arr[];
    public static int fibonnaci(int pos){
      
        if(arr[pos]!=-1){
            return arr[pos];
        }
        arr[pos]=fibonnaci(pos-1)+fibonnaci(pos-2);
        return arr[pos];

        

    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number");
        int num=Integer.parseInt(obj.readLine());
        arr=new int[num+1];
        Arrays.fill(arr,-1);
        arr[0]=0;
        arr[1]=1;
        System.out.println("the fiboonaci of the nummber is:"+fibonnaci(num));


    }
    
}
