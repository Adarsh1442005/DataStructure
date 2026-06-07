import java.util.*;
import java.io.*;
public class friendspair {
    public static int pair(int n){
      if(n==1){
        return 1;
      }
      if(n==2){
        return 2;

      }
      int single=pair(n-1);
      int dual=(n-1)*pair(n-2);
      return single+dual;



    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ente rthe number of friends");
        int num=Integer.parseInt(obj.readLine());
        System.out.println("the total number of distinct pair is :"+pair(num));


    }
    
}
