package Recursion;
import java.util.*;
import java.io.*;

public class subset2 {
    static ArrayList<ArrayList<Integer>> l1=new ArrayList<>();
    public static void subset(int nums[],int index,ArrayList<Integer> li){
        l1.add(new ArrayList<Integer>(li));
        for(int i=index;i<nums.length;i++){
            if(i==index){
                li.add(nums[i]);
                subset(nums,i+1,li);
                li.remove(li.size()-1);
                continue;
            }
            if(nums[i]==nums[i-1]){
                continue;
            }
            else{
                li.add(nums[i]);
                subset(nums,i+1,li);
                li.remove(li.size()-1);
            }
        }


    }
    public static void main(String argss[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array");
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
        Arrays.sort(arr);
        subset(arr,0,new ArrayList<Integer>());
        System.out.println(l1);

        
    }
    
}
