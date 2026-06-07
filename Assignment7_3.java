import java.util.*;
import java.io.*;
public class Assignment7_3 {
    public static void main(String args[]) throws IOException{
         BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
         int week_num=Integer.parseInt(obj.readLine());
        switch(week_num){
           case 1:System.out.println("Sunday");
                  break;
           case 2: System.out.println("Monday");
                   break;
           case 3: System.out.println("Tuesday");
                   break;
           case 4: System.out.println("wednesday");
                   break;
           case 5: System.out.println("thursday");
                   break;
           case 6:System.out.println("Friday");
                  break;
           case 7:System.out.println("Saturday");
                  break;
           default: System.out.println("given input is not belongs to 1 to 7");
                                                                    





        }




    }
    
}
