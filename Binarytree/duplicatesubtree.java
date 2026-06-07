package Binarytree;
import java.util.*;
import java.io.*;
public class duplicatesubtree {
   static  HashMap<String ,Integer> map=new HashMap();
   static  ArrayList<Node > li=new ArrayList();
    public static String dubli(Node root){
          if(root==null){
            return "#";
          }
          String str=root.data+dubli(root.left)+dubli(root.right);
            map.put(str,map.getOrDefault(str,0)+1);
            if(map.get(str)==2){
                li.add(root);
            }
            return str;




    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the value of x");
        
        int arr[]={1,2,4,-1,-1,-1,3,2,4,-1,-1,-1,4,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.build(arr);
        dubli(root);
        for(Node tr:li){
             
             tree.preorder(tr) ;
             System.out.println("");
        }




    }
    
}
