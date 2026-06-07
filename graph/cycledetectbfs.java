package graph;
import java.util.*;
import java.io.*;
class Edge1{
    int src;
    int dest;
    public Edge1(int src,int dist){
     this.src=src;
     this.dest=dist;
    }
}

public class cycledetectbfs {
    public static boolean detect(ArrayList<Edge1> arr[],int src,Queue<Integer> qu,boolean vis[],int parent[]){
    
    qu.add(src);
    while(!qu.isEmpty()){
        int node=qu.remove();
        vis[node]=true;
        ArrayList<Edge1> ar=arr[node];
        for(Edge1 ed:ar){
            if(vis[ed.dest] &&parent[ed.src]!=ed.dest){
                return true;
            }
            else if(!vis[ed.dest]){
              parent[ed.dest]=ed.src;
              qu.add(ed.dest);
            }
            

            
        }


    }
   return false;


    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the total number of vertices");
        int v=Integer.parseInt(obj.readLine());
        ArrayList<Edge1> arr[]=new ArrayList[v];
        for(int i=0;i<arr.length;i++){
        arr[i]=new ArrayList();
        }
        boolean vis[]=new boolean[v];
        Arrays.fill(vis,false);
        Queue<Integer> qu=new LinkedList<>();
        int parent[]=new int[v];
        arr[0].add(new Edge1(0,1));
        // arr[0].add(new Edge1(0,3));
        arr[1].add(new Edge1(1,0));
        arr[1].add(new Edge1(1,2));
        arr[2].add(new Edge1(2,3));
        arr[2].add(new Edge1(2,1));
        arr[3].add(new Edge1(3,2));
        // arr[3].add(new Edge1(3,0));

     if( detect(arr, 0,qu , vis,parent)){
        System.out.println("cycle exists:");
     }
     else{
        System.out.println("cycle does not exists");
     }
    }
    
}
