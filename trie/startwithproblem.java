import java.util.*;
import java.io.*;

public class startwithproblem {
    public static boolean search(Node root,String key){
       Node curr=root;
       int j=0;
       while(j<key.length()){
        char a=key.charAt(j);
        int index=a-'a';
        if(curr.arr[index]==null){
            return false;
        }
        else{
            curr=curr.arr[index];
            j++;
        }
       }
       return true;




        
    }
    public static Node insert(String arr[]){
     Node root=new Node();
     for(int i=0;i<arr.length;i++){
      String str=arr[i];
      int j=0;
      Node curr=root;
      while(j<str.length()){
         char a=str.charAt(j);
         int index=a-'a';
         if(curr.arr[index]==null){
            curr.arr[index]=new Node(a);
            curr=curr.arr[index];
            j++;
         }
         else{
            curr=curr.arr[index];
            j++;
         }





      }
      curr.last=true;






     }


return root;


    }
    public static void main(String args[]) throws IOException{
    BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter the total numbe of String :");
    int size=Integer.parseInt(obj.readLine());
    String arr[]=new String[size];
    for(int i=0;i<arr.length;i++){
        arr[i]=obj.readLine();
    }
System.out.println("enter the prefix to check");
String prefix=obj.readLine();
Node root=insert(arr);
if(search(root,prefix)){
    System.out.println("given prefix exist");
}
else{
    System.out.println("given prefix does not exist");
}

    





    }



    
}
