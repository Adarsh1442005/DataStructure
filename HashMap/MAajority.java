package HashMap;
import java.util.*;
import java.io.*;
public class MAajority {
    public static void majority(int arr[]){
    HashMap<Integer,Integer> map=new HashMap<>();
    int n=arr.length;
    n=n/3;
    map.put(arr[0],1);
    for(int i=1;i<arr.length;i++){
       map.put(arr[i],(map.getOrDefault(arr[i],0)+1));
    }
    Set<Integer> key=map.keySet();
    System.out.println("majority elements are:");
    for(int i:key){
        if(map.get(i)>n){
            System.out.println(i);
        }
    }

    








    }
    public static  void main(String args[]) throws IOException{
     BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("enter the size of the array:");
     int size=Integer.parseInt(obj.readLine());
     int arr[]=new int[size];
     for(int i=0;i<arr.length;i++){
        arr[i]=Integer.parseInt(obj.readLine());
     }

     majority(arr);









    }
    
}
