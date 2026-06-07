import java.util.*;
import java.io.*;
public class Assignment10_2 {
    static boolean arr[][];
    static byte ind=0;
    public static void main(String argbs[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("enter the number");
         String num=obj.readLine();
         arr=new boolean[num.length()][num.length()];
         for(int i=0;i<arr.length;i++){
        arr[i][i]=true;
         }
         for(int i=arr.length-2;i>=0;i--){
            for(int j=i+1;j<arr[i].length;j++){
                if(j-i==1){
                    if(num.charAt(i)==num.charAt(j)){
                        arr[i][j]=true;

                    }
                    else{
                        arr[i][j]=false;
                     
                    

                    }
                }
                else{
                    if((num.charAt(i)==num.charAt(j)) && arr[i+1][j-1]==true){
                        arr[i][j]=true;

                    }
                    else{
                        
                        arr[i][j]=false;
                       
                        



                        
                    }
                }
            }
           

         }
         if(arr[0][arr.length-1]==true){
            System.out.println("number is palindrome");
         }
         else{
            System.out.println("number is not palindrome");
         }


    }
    
}
