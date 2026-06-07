package Heap;
import java.util.*;
import java.io.*;
class Weak implements Comparable<Weak>{
  int arr[];
  int sol=0;
  int civ=0;
  int num;
  public Weak(int arr[],int num){

   this.arr=arr;
   this.num=num;
   for(int i=0;i<arr.length;i++){
    if(arr[i]==1){
        sol++;
    }
    else{
        civ++;
    }
   }




  }
  public int compareTo(Weak wk){
   if(this.sol!=wk.sol){
       return this.sol-wk.sol;
   }
   else{
    return this.num-wk.num;
   }



  }




}
public class soldier {
    public static void main(String arga[]) throws IOException{
    BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter the number of rows:");
    int rows=Integer.parseInt(obj.readLine());
    System.out.println("enter the number of columns:");
    int col=Integer.parseInt(obj.readLine());
    int arr[][]=new int[rows][col];
    for(int i=0;i<arr.length;i++){
        System.out.println("enter the "+i+"row:");
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]=Integer.parseInt(obj.readLine());
        }
    }
    PriorityQueue<Weak> qu=new PriorityQueue();

    for(int i=0;i<arr.length;i++){
        qu.add(new Weak(arr[i],i));

    }
    System.out.println("enter the whith weakest row you want:");
    int k=Integer.parseInt(obj.readLine());
    for(int i=0;i<k;i++){
        Weak wk=qu.remove();
        System.out.println("weakest row:"+wk.num);
    }







    }
    
}
