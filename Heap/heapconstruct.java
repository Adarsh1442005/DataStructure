package Heap;
import java.util.*;
import java.io.*;

class Heap{
ArrayList<Integer> arr=new ArrayList();
public void add(int data){
arr.add(data);
int curr=arr.size()-1;
int par=(curr-1)/2;
while(arr.get(par)>arr.get(curr)){
int temp=arr.get(par);
arr.set(par,arr.get(curr));
arr.set(curr,temp);
curr=par;
par=(curr-1)/2;
if(curr==0){
break;
}
}

}
public  void heapify(int i){
 int min=i;
 int left=2*min+1;
 int right=2*min+2;
 if(left<arr.size()&& (arr.get(min)>arr.get(left))){
   min= left;
 }
 if(right<arr.size() && (arr.get(min)>arr.get(right))){
   min=right;
 }
 if(min!=i){
    int temp=arr.get(min);
    arr.set(min,arr.get(i));
    arr.set(i,temp);
    heapify(min);
 }



}

public int peek(){
    return arr.get(0);
}

public void remove(){
int temp=arr.get(arr.size()-1);
arr.set(arr.size()-1,arr.get(0));
arr.set(0,temp);
arr.remove(arr.size()-1);
heapify(0);




}
public boolean  isEmpty(){
    return arr.size()==0;
}





}
public class heapconstruct {
    public static void main(String args[]) throws IOException{

   BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
   Heap heap=new Heap();
   heap.add(2);
   heap.add(3);
   heap.add(4);
   heap.add(5);
   heap.add(10);
   heap.add(6);
   for(int i:heap.arr){
    System.out.println(i);
   }
   System.out.println("print the data in sorted order");
   while(!heap.isEmpty()){
    System.out.println(heap.peek());
    heap.remove();
   }



    }
    
}
