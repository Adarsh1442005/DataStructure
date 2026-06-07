package Heap;
import java.util.*;
import java.io.*;
class Cell implements Comparable<Cell>{
    int x;
    int y;
    int cost;
    public Cell(int x,int y,int cost){
this.x=x;
this.y=y;
this.cost=cost;
    }
    public  int compareTo(Cell cell){
        return this.cost-cell.cost;
    }

}

public class pathwithminimumeffort {
    public static int  min(int arr[][]){
        int row=arr.length;
        int col=arr[0].length;
    int dist[][]=new int[row][col];
    for(int arr1[]:dist){
        Arrays.fill(arr1,Integer.MAX_VALUE);
    }
    dist[0][0]=arr[0][0];
    PriorityQueue<Cell> qu=new PriorityQueue<>();
    int  dir[][]={{1,0},{-1,0},{0,1},{0,-1}};
    qu.add(new Cell(0,0,arr[0][0]));
    
    while(!qu.isEmpty()){
        Cell cell=qu.poll();
        int x=cell.x;
        int y=cell.y;
        int cost=cell.cost;
        if(x==arr.length-1 && y==arr[0].length-1){
            return cost;
        }
        for(int dis[]:dir){
          int nx=x+dis[0];
          int  ny=y+dis[1];
            if((nx<arr.length && nx>=0) && (ny<arr[0].length && ny>=0)){
                int newcost=cost+arr[nx][ny];
                if(dist[nx][ny]>newcost){
                    dist[nx][ny]=newcost;
                    qu.add(new Cell(nx,ny,newcost));
                }
            }
        

        }






    }
    return -1;





    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of rows:");
        int rows=Integer.parseInt(obj.readLine());
        System.out.println("enter the cnumbe rof column:");
        int col=Integer.parseInt(obj.readLine());
        int arr[][]={ { 31, 100, 65, 12, 18 },{ 10, 13, 47, 157, 6 },{ 100, 113, 174, 11, 33 },{ 88, 124, 41, 20, 140 },{ 99, 32, 111, 41, 20 } };

        // for(int i=0;i<arr.length;i++){
        //     System.out.println("enter the row:"+i);
        //     for(int j=0;j<arr[i].length;j++){
        //     arr[i][j]=Integer.parseInt(obj.readLine());
        //     }
        // }
       System.out.println( min(arr));



    }
}
