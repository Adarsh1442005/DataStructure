import java.util.*;
import java.io.*;
public class Assignment20_3 {
    static int count=0;
    public static int length(char arr[],int index){
       if(index==arr.length-1){
        count++;
        return count;
       } 
       count++;
       length(arr, index+1);   
       return count;

    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        String str=obj.readLine();
        char arr[];
        arr=str.toCharArray();
       int length= length(arr,0);
       System.out.println("length of the string is :"+length);


    }
    
}
