package arrayrevision;
import java.util.*;
import java.io.*;
public class threesum {
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array");
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
        Arrays.sort(arr);
        List<List<Integer>> li=new ArrayList();
        for(int i=0;i<arr.length-2;i++){
            if(i!=0 && arr[i-1]==arr[i]){
                continue;
            }
           int left=i+1;

           int right=arr.length-1;
           while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==-1*(arr[i])){
                List<Integer> l1=new ArrayList();
                 l1.add(arr[i]);
                 l1.add(arr[left]);
                 l1.add(arr[right] );
                 li.add(l1);
                 left++;
                 right--; 
                 while(left<right && arr[left]==arr[left-1]){
                    left++;
                 }
                 while(left<right && arr[right]==arr[right+1]){
                    right--;
                 }
            }
            else if((sum+arr[i]>0)){
                right=right-1;

            }
            else{
                left=left+1;
            }
           }

        }
        for(List<Integer> l:li){
            for(int i:l){
                System.out.print(i+",");
            }
            System.out.println("");
        }

    }
    
}
