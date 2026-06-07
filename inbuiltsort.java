import java.util.*;
import java.io.*;
public class inbuiltsort {
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array");
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
        Arrays.sort(arr);
        for(int i:arr){
            System.out.print(i+",");
        }
        
    }
    
}
