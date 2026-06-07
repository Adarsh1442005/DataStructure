package graph;
import java.util.*;
import java.io.*;
class Time{
    int row;
    int col;
    int time;
    public Time(int row,int col,int time){
      this.row=row;
      this.col=col;
      this.time=time;
    }
}
public class rootenorange{
    public static int rotten(int arr[][],Queue<Time> qu){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]==2){
                qu.add(new Time(i,j,0));
            }
        }
    }
    int maxtime=0;
    while(!qu.isEmpty()){
        Time t=qu.remove();
        int row=t.row;
        int col=t.col;
        int time=t.time;
        if(col+1<arr[0].length && arr[row][col+1]==1){
            arr[row][col+1]=2;
            qu.add(new Time(row,col+1,time+1));
            maxtime=time+1;
        }
        if(col-1>=0 && arr[row][col-1]==1){
            arr[row][col-1]=2;
            qu.add(new Time(row,col-1,time+1));
            maxtime=time+1;


        }
        if(row-1>=0 && arr[row-1][col]==1){
             arr[row-1][col]=2;
             qu.add(new Time(row-1,col,time+1));
             maxtime=time+1;
        }
        if(row+1<arr.length && arr[row+1][col]==1){
          arr[row+1][col]=2;
          qu.add(new Time(row+1,col,time+1));
          maxtime=time+1;
        }
    }
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]==1){
                return -1;
            }
        }
    }
  return maxtime;



    }
    public static void main(String args[]) throws IOException{
     BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("enter the total number of rows");
     int rows=Integer.parseInt(obj.readLine());
     System.out.println("enter the total number of column:");
     int col=Integer.parseInt(obj.readLine());
     int arr[][]=new int[rows][col];
     for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]=Integer.parseInt(obj.readLine());
        }
     }
    System.out.println("max time in rotten all oranges :"+rotten(arr, new LinkedList<>()));

    }
}
