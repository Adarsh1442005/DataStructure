package graph;
import java.util.*;
import java.io.*;
class Dist implements Comparable<Dist>{
    int dest;
    int cost;
    public Dist(int dest,int cost){
        this.dest=dest;
        this.cost=cost;

    }
    public int compareTo(Dist di){
        return  this.cost-di.cost;
    }
} 
public class connectingcities {
    public static void connectingcities(ArrayList<Ed> graph[],HashSet<Integer> mst, HashSet<Integer> nonmst){
        PriorityQueue<Ed> qu=new PriorityQueue<>();
      boolean vis[]=new boolean[graph.length];
     int cost=0;
        nonmst.remove(0);
        mst.add(0);
        vis[0]=true;
        while(!nonmst.isEmpty()){
            for(int i:mst){
                ArrayList<Ed> arr=graph[i];
                for(Ed ed:arr){
                    if(!vis[ed.dest]){
                        qu.add(ed);
                    }
                }

            }
            Ed ed=qu.remove();
     vis[ed.dest]=true;
     nonmst.remove(ed.dest);
     cost=cost+ed.cost;
     mst.add(ed.dest);
     qu.clear();

        }
     



   System.out.println("total cost is: "+cost);


    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the totla number of cities");
        int city=Integer.parseInt(obj.readLine());
        int arr[][]= new int[city][city];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the cost cities connected by :"+i);
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=Integer.parseInt(obj.readLine());  
            }
        }
        ArrayList<Ed> graph[]=new ArrayList[city];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(j!=i && arr[i][j]>0){
                    graph[i].add(new Ed(i,j,arr[i][j]));
                }
            }
        }
        HashSet<Integer> nonmst=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            nonmst.add(i);

        }
        HashSet<Integer> mst=new HashSet<>();
        connectingcities(graph, mst, nonmst);
    }
    
}
