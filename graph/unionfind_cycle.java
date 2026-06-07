package graph;
import java.util.*;
import java.io.*;
class ed1{
    int src;
    int dest;
    public ed1(int src,int dest){
       this.src=src;
       this.dest=dest;
    }
}

public class unionfind_cycle {
    static int parent[];
    static int rank[];
    public static int  find(int u){
        if(parent[u]==u){
            return u;
        }
        parent[u]=find(parent[u]);
        return parent[u];

    }
    public static int union(int a ,int b){
        int para=find(a);
        int parb=find(b);
        if(para==parb){
            return -1;
        }
        else if(rank[para]==rank[parb]){
            parent[para]=parb;
            rank[parb]++;
        }
        else if(rank[para]>rank[parb]){
            parent[parb]=para;

        }
        else{
            parent[para]=parb;
        }
        return 0;

    }
    public static int  cycledetect(ArrayList<ed1> arr){
     for(ed1 e:arr){
        int src=e.src;
        int dest=e.dest;
       if( union(src,dest)==-1){
        System.out.println("yes the cycle exist in the graph");
        return 0;
       }

     }
     return -1;





    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the total number of vertices:");
        int v=Integer.parseInt(obj.readLine());
        ArrayList<ed1> arr=new ArrayList();
        arr.add(new ed1(1,9));
        // arr.add(new ed1(1,5));
        arr.add(new ed1(9,5));
        arr.add(new ed1(5,2));
        arr.add(new ed1(2,7));
        int par[]=new int[10];
       int ran[]=new int[10];
        for(int i=0;i<par.length;i++){
            par[i]=i;
            ran[i]=0;
        }
        parent=par;
        rank=ran;
      if(  cycledetect(arr)==-1){
          System.out.println("cycle does not exist");
          return;
      }
      System.out.println("cycle exist");



    }
    
}
