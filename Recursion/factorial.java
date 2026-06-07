package Recursion;
import java.util.*;
import java.io.*;
public class factorial {
    public static int fact(int num){
        if(num==1){
            return 1;
        }

        return num*fact(num-1);

    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number ");
        int num=Integer.parseInt(obj.readLine());
        System.out.println("factorial of the number is:"+fact(num));

    }
    
}
