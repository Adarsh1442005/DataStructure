import java.io.*;
import java.util.*;
public class Assignment7_2 {
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        double temp=Float.parseFloat(obj.readLine());
        if(temp>100){
            System.out.println("I have  a fever ");

        }
        else{
            System.out.print("i have no fever");
        }

    }
    
}
