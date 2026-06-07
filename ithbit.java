import java.util.*;
import java.io.*;
public class ithbit {
    public static void getith(int num,int i,int bitmask){
            if((num & bitmask)==0){
                System.out.println("the bit at the "+i+"th"+"position is: 0");
                return ;
            }
             System.out.println("the bit at the "+i+"th"+"position is: 1");


    }
    public static void setith(int num,int i,int bitmask){
       int result=num|bitmask;
       System.out.println("the result after setting the ith bit is :"+result);



    }
    public static void main(String args[]) throws IOException{
      BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("enter the number");
      int num=Integer.parseInt(obj.readLine());
      System.out.println("enter the ith position");
      int i=Integer.parseInt(obj.readLine());
      int bitmask=1<<i;
      getith(num, i, bitmask);
      setith(num,i,bitmask);


    



    }
    
}
