import java.util.*;
import java.io.*;
public class Assignment7_5 {
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        int year=Integer.parseInt(obj.readLine());
     if(year %4==0 ){
        if( (year %100)!=0){
        System.out.println("year is leap year");
        }
        else if(year %400==0){
            System.out.println("year is a leap year");
        }
        else{
            System.out.println("year is not a leap year");
        }
        

     }
     else{
        System.out.println("year is not a leap year");
     }




    }
    
}
