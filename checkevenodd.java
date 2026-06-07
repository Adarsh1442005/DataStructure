import java.util.*;
import java.io.*;
public class checkevenodd {
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number");
        int num=Integer.parseInt(obj.readLine());
        if((num & 1) ==0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }

}
