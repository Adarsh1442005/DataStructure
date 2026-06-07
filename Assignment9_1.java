import java.util.*;
import java.io.*;
public class Assignment9_1 {
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        char a=obj.readLine().charAt(0);
        int k=4;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=k;j++){
                System.out.print(a);
            }
            System.out.println(" ");
            k=k-1;
            
        }


          
        
    }
    
}
