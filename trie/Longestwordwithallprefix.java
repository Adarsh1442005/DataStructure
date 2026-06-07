import java.util.*;
import java.io.*;

public class Longestwordwithallprefix {
   static  Node root=new Node();
   static String ans="";

public static boolean search(String str){
    Node curr=root;
    for(int i=0;i<str.length();i++){
        char a=str.charAt(i);
        int index=a-'a';
        if(curr.arr[index]==null){
            return false;
        }
        else{
          curr=curr.arr[index];
          if(curr.last!=true){
            return false;

          }

        }

    }
    return true;






}

    public static void  insert(String arr[]){
        for(int i=0;i<arr.length;i++){
            Node curr=root;
            String str=arr[i];
            int j=0;
            while(j<str.length()){
               char a=str.charAt(j);
               int index=a-'a';
               if(curr.arr[index]==null){
                curr.arr[index]=new Node(a);
                j++;
                curr=curr.arr[index];

               }
               else{
                curr=curr.arr[index];
                j++;

               }
            }
            curr.last=true;
        }
        
        





    }
     public static void main(String args[]) throws IOException{
         BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("enter the size of the array");
         int size=Integer.parseInt(obj.readLine());
         String arr[]=new String[size];
         for(int i=0;i<size;i++){
            arr[i]=obj.readLine();
         }

         insert(arr);

         for(int i=0;i<arr.length;i++){
            String str=arr[i];
            if(search(str)){
                if(str.length()>ans.length()){
                    ans=str;
                }
                else if(str.length()==ans.length()){
                    TreeMap<String,Integer> map=new TreeMap();
                    map.put(str,1);
                    map.put(ans,1);
                    Set<String> set=map.keySet();
                    ArrayList<String > ar=new ArrayList();
                    for(String st:set){
                        ar.add(st);
                    }
                    ans=ar.get(0);

                }

            }

         }
         System.out.println("largest string is :"+ans);








     }
    
}
