package hashset;
import java.util.*;
import java.io.*;

public class distinctelements {
    public static int distinct(int arr[]){
   HashSet<Integer> set=new HashSet();
   for(int i:arr){
    set.add(i);

   }
   return set.size();






    }
    public static void main(String args[] ) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array");
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
        System.out.println("numbe rof distince elements is:"+distinct(arr));

        
    }
}
