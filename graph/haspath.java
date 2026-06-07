package graph;
import java.util.*;
import java.io.*;
public class haspath {
    
    public static boolean haspath(ArrayList<Edge> graph[],int src,int dest,boolean vis[]){
        if(src==dest){
            return true;
        }
        vis[src]=true;
        ArrayList<Edge> ed=graph[src];
        for(Edge edge:ed){
            int dist=edge.dest;
            if(!vis[dist] && haspath(graph,dist,dest,vis)){
                return true;
            }

        }
        return false;

 





    }
    public static void main(String args[]) throws IOException{
    BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
    bfstraversal tr=new bfstraversal();
    ArrayList<Edge> arr[]=tr.main(args);
    boolean vis[]=new boolean[arr.length];
    for(int i=0;i<vis.length;i++){
        vis[i]=false;
    }
   if( haspath(arr, 0, 5,vis )){
    System.out.println("yes the path exist");
   }
   else{
    System.out.println("path does not exists");
   }










    }
}
