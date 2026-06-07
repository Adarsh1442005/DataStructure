package Stack;
import java.util.*;
import java.io.*;

public class trappingrainwater {
    public static int trap(int arr[]){
        int water=0;
      Stack<Integer> st=new Stack();
      for(int i=0;i<arr.length;i++){
        while(!st.isEmpty()  && arr[i]>arr[st.peek()]){
            int elem=arr[st.pop()];
            if(st.isEmpty()){
                break;
            }
            int right=arr[i];
            int left=arr[st.peek()];
            int distance=i-st.peek()-1;
            int width=Math.min(arr[i],(left-elem));
            water=water+distance*width;
        
        }
        st.push(i);


      }
      return water;
   


    }
    public static void main(String args[]) throws IOException{
       BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("the water trapped is:"+trap(height));


    }
    
}
