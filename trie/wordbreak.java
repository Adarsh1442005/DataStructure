import java.util.*;
import java.io.*;
public class wordbreak {

    public static boolean search(String str,Node root){

     Node curr=root;
     int j=0;
     while(j<str.length()){
        char a=str.charAt(j);
        int index=a-'a';
        if(curr.arr[index]==null){
            return false;
        }
        else{
            curr=curr.arr[index];
            j++;
        }
     }
     if(curr.last){
        return true;
     }
     return false;






    }
    public static Node insert(String arr[]){
          Node root=new Node();
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
          return root;
    }

    public static boolean wordbreak(String key,Node root){
        if(key.length()==0){
            return true;
        }
      for(int i=1;i<=key.length();i++){
         if(search(key.substring(0,i),root) && wordbreak(key.substring(i),root)){
            return true;
           }

   

      }
      return false;

      



    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the toatal number of Strings:");
        int size=Integer.parseInt(obj.readLine());
        String arr[]=new String [size];
        for(int i=0;i<arr.length;i++){
            arr[i]=obj.readLine();
        }
        System.out.println("enter the key String:");
        String key=obj.readLine();
      Node root=  insert(arr);
    //   if(search("sams",root)){
    //     System.out.println("yes exist");
    //   }

     if (wordbreak(key,root)){
        System.out.println("yes the word is breakble");
     }
     else{
        System.out.println("word is not breakable");
     }


    }
}
