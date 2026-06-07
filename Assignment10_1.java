import java.util.*;
import java.io.*;
public class Assignment10_1 {
    public static int sum(int num){
        if(num==0){
            return 0;
        }
       int sum=num%10+sum(num/10);
       return sum;

    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter the number");
        int num=Integer.parseInt(obj.readLine());
        System.out.println("the sum of digits of the number is"+sum(num));

    }
    
}
