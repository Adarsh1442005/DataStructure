import java.util.*;
import java.io.*;
public class Assignment8_1 {
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(obj.readLine());
        if(num==0){
            System.out.println("factoril of the number is :"+1);
            return;
        }
        for(int i=num-1;i>=1;i--){
          num=num*i;
        }
        System.out.println("factoril of the number is :"+num);



    }
    
}
