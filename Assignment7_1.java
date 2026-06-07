import java.util.*;
import java.io.*;

public class Assignment7_1{
    public static void main(String args[]) throws IOException{
      BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
      int num=Integer.parseInt(obj.readLine());
      if(num<0){
        System.out.println("the provide number is negative");
      }
      else{
        System.out.println("provided number is positive");
      }




    }

}