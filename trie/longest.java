import java.util.*;
import java.io.*;
// class Node{
//   char a;
//   Node arr[]=new Node[26];
//   public Node(char a ){
//     this.a=a;
//   }
//   public Node(){

//   }
//   boolean last=false;

// }

public class longest {
    static Node root=new Node();
   static int length=0;
   static String ans="a";
    public static void insert(String arr[]){
      for(int i=0;i<arr.length;i++){
        String str=arr[i];
        int j=0;
        Node rootc=root;
        while(j<str.length()){
        char a=str.charAt(j);
        int index=a-'a';
        if(rootc.arr[index]==null){
            rootc.arr[index]=new Node(a);
            rootc=rootc.arr[index];
            j++;
        }
        else{
            rootc=rootc.arr[index];
            j++;
        }






        }
        rootc.last=true;
      }
    







    }
    public static boolean valid(String str){
        
       int j=0;
       Node rootc=root;
       while(j<str.length()){
         char a=str.charAt(j);
         int index=a-'a';
         if(rootc.arr[index]==null){
            return false;
         }
         else{
            rootc=rootc.arr[index];
            j++;
         }


       }
       if(rootc.last){
        return true;
       }

       return false;



    }
    public static boolean check(String str){
    for(int i=1;i<=str.length();i++){
        String sub=str.substring(0,i);
        if(valid(sub)){
            continue;
        }
        else{
            return false;
        }
        
    }
    return true;




    }
    public static void main(String args[]) throws IOException{
     BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("enter the size of the array:");
     int size=Integer.parseInt(obj.readLine());
     String arr[]=new String[size];
     System.out.println("enter the strings in the array");
     for(int i=0;i<arr.length;i++){
        arr[i]=obj.readLine();

     }
     insert(arr);
     for(int i=0;i<arr.length;i++){
    if(check(arr[i])){
      if (length<arr[i].length()){
       ans=arr[i];
    length=ans.length();
      }
      else if(arr[i].length()==length){
       if( ans.compareTo(arr[i])>0){
         ans=arr[i];
         
       }



      }


     }
    



     }
     System.out.println("lexicographically shortest string is :"+ans);
    }







    }

