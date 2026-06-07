package greedyalgo;
import java.util.*;
import java.io.*;

public class lexicographically {
    public static ArrayList lexo(int n, int k,HashMap<Integer,Character> map){
          ArrayList<Character> arr=new ArrayList();
          for(int i=0;i<n;i++){
            arr.add('a');
          }
          int curr_sum=arr.size()*1;
          int i=arr.size()-1;
          int remain=k-curr_sum;
          while(remain!=0){
            arr.remove(i);
            remain=remain+1;
            if(remain>=26){
                remain=remain-26;
                arr.add(i,'z');
                i--;
                
                 
            }
            else{
                arr.add(i,map.get(remain));
                remain=0;
                i--;

            }

          }
          return arr;


    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the value of n:");
        int n=Integer.parseInt(obj.readLine());
        System.out.println("enter the value of K:");
        int k=Integer.parseInt(obj.readLine());
        HashMap<Integer,Character> map=new HashMap();
          for (int i = 1; i <= 26; i++) {
            char letter = (char) ('a' + i - 1); // convert number to letter
            map.put(i, letter);
        }


         ArrayList<Character> arr=lexo(n, k, map);
        for(char a:arr){
            System.out.println(a);
        }
        
        
             
        
        
        
        
        

           

           

        
        

    }

    
}
