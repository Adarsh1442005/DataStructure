import java.util.*;
import java.io.*;
public class Assignment20_2 {
    public static void numto_str(String arr[],int index,String num){
      if(index==num.length()-1){
        int ind=num.charAt(index)-'0';
        System.out.print(arr[ind]+" ");
        return;
      }  
      int ind=num.charAt(index)-'0'; 
      System.out.print(arr[ind]+" ");
      numto_str(arr,index+1,num);

  

    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number");
        String num=obj.readLine();
        String arr[]={"zero","one","two","three","four","five","six","seven","eight","Nine"};
      
        if(num.charAt(num.length()-1)=='0'){
           System.out.println("the number is invalid");
           return;
        }
        else{
            numto_str( arr,0,num);

        }



    }
    
}
