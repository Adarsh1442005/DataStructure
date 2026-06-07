package graph;
import java.util.*;
import java.io.*;

public class mothervertex {
    public static void dfs(ArrayList<Integer> arr[],int v,boolean vis[]){
       vis[v]=true;
       for(int neigh:arr[v]){
        if(!vis[neigh]){
            dfs(arr,neigh,vis);
        }
       }

 }
 public static int findmother(ArrayList<Integer> arr[],boolean vis[]){
       int candidate=-1;
       for(int i=0;i<arr.length;i++){
        if(!vis[i]){
            dfs(arr,i,vis);
            candidate=i;

        }
        

       }
  Arrays.fill(vis,false);
  dfs(arr,candidate,vis);
  for(int i=0;i<vis.length;i++){
    if(!vis[i]){
       return -1;
    }
}
return candidate;



 }
    public static void main(String args[]) throws IOException{
         BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("enter the total number of vertices:");
         int v=Integer.parseInt(obj.readLine());
         boolean vis[]=new boolean[v];
         ArrayList<Integer> arr[]=new ArrayList [v];
         for(int i=0;i<arr.length;i++){
            arr[i]=new ArrayList<>();
         }


         Arrays.fill(vis,false);
         arr[0].add(2);
         arr[0].add(3);
         arr[1].add(0);
         arr[2].add(1);
         arr[3].add(4);
        System.out.println(findmother(arr, vis));


    }
}
