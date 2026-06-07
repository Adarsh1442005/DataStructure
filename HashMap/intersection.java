package HashMap;

import java.util.*;
import java.io.*;
public class intersection {
    public static void intersection(int arr1[],int arr2[]){
     HashMap<Integer,Integer> map=new HashMap();
     HashSet<Integer> set1=new HashSet();
     HashSet<Integer> set2=new HashSet();
     for(int i=0;i<arr1.length;i++){
     set1.add(arr1[i]);

     }
     for(int i=0;i<arr2.length;i++){
        set2.add(arr2[i]);
     }
     for(int i:set1){
        map.put(i,1);
     }
     for(int i:set2){
        map.put(i,(map.getOrDefault(i,0)+1));
     }
     Set<Integer> set=map.keySet();
     System.out.println("intersections are:");
     for(int i:set){
         if(map.get(i)>1){
            System.out.print(i+",");
         }
     }


    }
    public  static void main(String args[]) throws IOException{
       BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("enter the size of the array1:");
       int size1=Integer.parseInt(obj.readLine());
       System.out.println("enter the size of the array:2");
       int size2=Integer.parseInt(obj.readLine());
       int arr1[]=new int[size1];
       int arr2[]=new int[size2];
       System.out.println("enter the suize of the array1:");
       for(int i=0;i<arr1.length;i++){
          arr1[i]=Integer.parseInt(obj.readLine());
       }
       for(int i=0;i<arr2.length ;i++){
        arr2[i]=Integer.parseInt(obj.readLine());
       }
     intersection(arr1,arr2);



   



    }

    
}
