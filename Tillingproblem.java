import java.util.*;
import java.io.*;
public class Tillingproblem {
    public static int  place(int n){
           if(n==0){
            return 1;
           }
           if(n==1){
            return 1;
           }
           int horizontal=place(n-2);
           int vertical=place(n-1);
           int total=horizontal+vertical;
           return total;





    }
  public static void main(String args[]) throws IOException{
    BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter the value of number of column");
    int col=Integer.parseInt(obj.readLine());
    System.out.println(place(col));



  }
    
}
