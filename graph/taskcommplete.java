package graph;
import java.util.*;
import java.io.*;
class Eda{
    int src;
    int dest;
    public Eda(int src,int dest){
       this.src=src;
       this.dest=dest;
    }
}

public class taskcommplete {
    public static boolean task(ArrayList<Eda> graph[],int src,boolean vis[],boolean stack[]){
     vis[src]=true;
     stack[src]=true;
     ArrayList<Eda> arr=graph[src];
     for(Eda ed:arr){
        int dest1=ed.dest;
        if(stack[dest1]==true){
            return true;
        }
        if(!vis[dest1]){
            if(task(graph,dest1,vis,stack)){
                return true;
            }
        }

     }
     stack[src]=false;
     return false;

    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the total number of tasks");
        int task=Integer.parseInt(obj.readLine());
        int arr[][]={{1,0}};
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         arr[i][j]=Integer.parseInt(obj.readLine());
        //     }
        // }
        ArrayList<Eda> graph[]=new ArrayList[task];
     for(int i=0;i<task;i++){
        graph[i]=new ArrayList();
     }
     for(int i=0;i<arr.length;i++){
       int src=arr[i][1];
       int dest=arr[i][0];
       Eda edge=new Eda(src,dest);
        graph[src].add(edge);

     }
     boolean vis[]=new boolean[task];
     for(int i=0;i<task;i++){
        if(!vis[i]){
            if(task(graph, i, vis, vis)){
                System.out.println("task cannot be complete");
                return ;
            }
        }
     }
     System.out.println("task will be complete");


    }
}
