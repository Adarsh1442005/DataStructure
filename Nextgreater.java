import java.util.*;
import java.io.*;
public class Nextgreater {
    public static int[] nextgreater(int arr[]){
         Stack<Integer> st=new Stack();
         int arrin[]=new int[arr.length];
         st.push(arr[arr.length-1]);
         arrin[arrin.length-1]=-1;
         for(int i=arr.length-2;i>=0;i--){
            while(!st.isEmpty() && arr[i]>st.peek()){
                st.pop();
            }
            arrin[i]=st.peek();
            st.push(arr[i]);

         }
         return arrin;
         




   



    }
    public static void main(String args[]) throws IOException{
           BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
           System.out.println("enter the size of the array");
           int size=Integer.parseInt(obj.readLine());
           int arr[]=new int[size];
           for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
            }
          int arrin[]=  nextgreater(arr);
          System.out.println("array of elements is:");
          for(int i: arr){
            System.out.print(i);
          }
          System.out.println("");
          System.out.println("next greater elements are");
          for(int i: arrin){
            System.out.print(i);
          }






    }
    
}
