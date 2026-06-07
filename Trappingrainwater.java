import java.util.*;
import java.io.*;
public class Trappingrainwater {
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array");
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int [size];
        System.out.println("enter the size of the towers");
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
        int leftmax[]=new int[size];
        int rightmax[]=new int[size];
        leftmax[0]=arr[0];
        for(int i=1;i<size;i++){
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);

        }
        rightmax[size-1]=arr[size-1];
        for(int i=arr.length-2;i>=0;i--){
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);

            
        }
        int watertrap=0;
        for(int i=1;i<arr.length-1;i++){
            int water_level=Math.min(leftmax[i],rightmax[i]);
            int trap=water_level-arr[i];
            if(trap>0){
                watertrap=watertrap+trap;
            }


            
        }
        System.out.println("total water trap is "+watertrap);




    }
    
}
