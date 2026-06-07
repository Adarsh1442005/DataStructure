import java.util.*;
import java.io.*;
public class Assignment8_3 {
    public static void main(String[]str)throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(obj.readLine());
        while((num/10)!=0){
            System.out.print((num%10));
            num=num/10;
        }
        System.out.print(num);

    }
    
}
