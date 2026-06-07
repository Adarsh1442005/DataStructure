package arrayrevision;
import java.util.*;
import java.io.*;
public class duplicate {
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array");
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
        HashSet<Integer> set=new HashSet();
        for(int i=0;i<arr.length;i++){
          if(set.contains(arr[i])){
            System.out.println("duplicate elements exist");
            break;
          }
          else{
            set.add(arr[i]);
          }
        }

    }
    
}
