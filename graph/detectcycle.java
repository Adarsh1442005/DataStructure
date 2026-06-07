package graph;
import java.util.*;
import java.io.*;
public class detectcycle {
 static int i=0;
public static void dfs(ArrayList<Edge> graph[],boolean vis[]){
for(int i=0;i<graph.length;i++){
    if(!vis[i]){
        if(dfs(graph,i,-1,vis)){
            System.out.println("one componenet is Cyclis in the graphi");
            i=1;
        }
       
    }
}
if(i!=1){
    System.out.println("no any componenet is connnected");
}





}
public static boolean dfs(ArrayList<Edge> graph[],int src,int parents,boolean vis[]){
  vis[src]=true;
  ArrayList<Edge> ar=graph[src];
  for(Edge ed:ar){
    int dest=ed.dest;
    if(vis[dest] && dest!=parents ){
      return true;
    }
    else if(!vis[dest]){
      return dfs(graph,dest,src,vis);

    }
  }
return false;




}

public static void main(String args[]) throws IOException{
    BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
    bfstraversal tr=new bfstraversal();
    ArrayList<Edge> arr[]=tr.main(args);
    boolean vis[]=new boolean[arr.length];
    for(int i=0;i<vis.length;i++){
        vis[i]=false;
    }
    dfs(arr,vis);
    if(i==1){

    }

    

}
}
