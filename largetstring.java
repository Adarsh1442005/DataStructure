import java.util.*;
import java.io.*;
public class largetstring {
    public static void main(String args[]) throws IOException{
    BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter the size of the array");
    int size=Integer.parseInt(obj.readLine());
    String arr[]=new String[size];
    for(int i=0;i<arr.length;i++){
        arr[i]=obj.readLine();
    }
    String largest=arr[0];
    for(int i=1;i<arr.length;i++){
       if(largest.compareToIgnoreCase(arr[i])<0){
        largest=arr[i];

       }

    }
    System.out.println("largest string is :"+largest);



    }
}
