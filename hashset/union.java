package hashset;
import java.util.*;
import java.io.*;
public class union {
    public static void union(int arr1[],int arr2[]){
    HashSet<Integer> set=new HashSet<>();
    for(int i=0;i<arr1.length;i++){
        set.add(arr1[i]);
    }
    for(int i:arr2){
        set.add(i);
    }
    System.out.println("unoin of the two set is :");
    for(int i:set){
        System.out.print(i+",");
    }
  




    }
    public static void main(String args[]) throws IOException{
             BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
             System.out.println("enter the size of the array 1:");
             int size1=Integer.parseInt(obj.readLine());
             System.out.println("enter the size of the array2:");
             int size2=Integer.parseInt(obj.readLine());
             int arr1[]=new int[size1];
             int arr2[]=new int[size2];
             System.out.println("enter the arr1:");
             for(int i=0;i<arr1.length;i++){
                arr1[i]=Integer.parseInt(obj.readLine());

             }
             System.out.println("enter the arr2:");
             for(int i=0;i<arr2.length;i++){
                arr2[i]=Integer.parseInt(obj.readLine());
             }
             union(arr1, arr2);



    }
    
}
