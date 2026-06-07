package Binarytree;
import java.util.*;
import java.io.*;
class Tr{
    int data;
    Tr left=null;
    Tr right=null;
    public Tr(int data){
        this.data=data;

    }

}
class Val{
    Tr tree;
    int pos;
    public Val(Tr tree,int pos){
        this.tree=tree;
        this.pos=pos;

    }
}
public class top{
    static Queue<Val> qu=new LinkedList<>();
    static HashMap<Integer,Integer> map=new HashMap<>();
    public static void levelOrder(Tr root){
       qu.add(new Val(root, 0));
       while(!qu.isEmpty()){
        Val v=qu.remove();
        Tr tree=v.tree;
        int val=tree.data;
        int pos=v.pos;
        if(!map.containsKey(pos)){
            map.put(pos,val);
        }
        if(tree.left!=null){
            qu.add(new Val(tree.left, pos-1));
        }
        if(tree.right!=null){
            qu.add(new Val(tree.right,pos+1));
        }
       }






    }

    public static void main(String args[]) throws IOException{
       
        Tr tree=new Tr(1);
        tree.left=new Tr(2);
        tree.right=new Tr(3);
        tree.left.right=new Tr(4);
        tree.left.right.right=new Tr(5);
        tree.left.right.right.right=new Tr(6);
        levelOrder(tree);
        Set<Integer> set=map.keySet();
        for(int i :set){
            System.out.println(i);
        }
        



    }


}


