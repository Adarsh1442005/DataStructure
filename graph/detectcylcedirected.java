package graph;
import java.util.*;
import java.io.*;
//Remember we are not using modified travesal algorithm becasue we are thing all the componets are connected but in contest you should
// use conmnected component approach and you know how to do that.

public class detectcylcedirected {
    public static boolean iscycle(ArrayList<Edge> graph[],boolean vis[],boolean stack[],int src){
     vis[src]=true;
     stack[src]=true;
     ArrayList<Edge> arr=graph[src];
     for(Edge ed:arr){
        int dest=ed.dest;
        if(stack[dest]){
            return true;
        }
        if(!vis[dest]){
            if(iscycle(graph,vis,stack,dest)){
                return true;
            }
        }
     }
     stack[src]=false;

return false;


    }
      public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of vertices ");
        int size=Integer.parseInt(obj.readLine());
        boolean vis[]=new boolean[size];
        for(int i=0;i<vis.length;i++){
            vis[i]=false;
        }
        ArrayList<Edge> graph[]=new ArrayList[size];
        boolean stack[]=new boolean[size];
        Arrays.fill(stack,false);
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,3));
       if( iscycle(graph, vis, stack, 0)){
        System.out.println("graph is cyclic");
        
       }
       else{
        System.out.println("graph is not cyclic");
       }



        

      }
}
