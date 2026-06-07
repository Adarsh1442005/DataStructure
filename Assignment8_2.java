import java.util.*;
import java.io.*;
public class Assignment8_2 {
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(obj.readLine());
        System.out.println("table of the number is:");
        for(int i=1;i<=10;i++){
            System.out.println(num+"*"+i+"="+(num*i));
        }


    }
    
}
