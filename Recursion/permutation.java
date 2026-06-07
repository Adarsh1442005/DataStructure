package Recursion;
import java.util.*;
import java.io.*;

public class permutation {
    static List<String > li=new ArrayList<>();
    public static void perm(int nums[],int track[],String perm){
        if(perm.length()==nums.length){
            li.add(perm);
        }
        
        for(int i=0;i<track.length;i++){
            if(track[i]==1){
                continue;
            }
            else{
                track[i]=1;
                perm(nums,track,perm+Integer.toString(nums[i]));
                track[i]=0;
            }
        }
        

             

    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array");
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new  int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
        perm(arr, new int[arr.length], new String());
        System.out.println("permutation are:"+li);


    }
    
}
