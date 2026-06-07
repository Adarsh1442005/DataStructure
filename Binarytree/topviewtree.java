package Binarytree;
import java.util.*;
import java.io.*;
class pair{
   Node node;
   int dis;
   public pair(Node node, int dist){
       this.node=node;
       this.dis=dist;
   }
}
public class topviewtree {
    public static HashMap top(Node root){
         Queue<pair> qu=new LinkedList<>();
         qu.add(new pair(root,0));
         HashMap<Integer,Integer> map=new HashMap();
         while(!qu.isEmpty()){
            pair p=qu.poll();
            if(!map.containsKey(p.dis)){
                map.put(p.dis,p.node.data);
            }
            if(p.node.left!=null){
            qu.add(new pair(p.node.left,p.dis-1));
            }
            if(p.node.right!=null){
                qu.add(new pair(p.node.right,p.dis+1));
            }
          }

            return map;

    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
         int arr[] = { 1,2,-1,4,-1,5,-1,6,-1,-1,3,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.build(arr);
        HashMap<Integer,Integer> map=top(root);
        Set<Integer> set=map.keySet();
        for(int i:set){
            System.out.println("top vies are:"+map.get(i));
        }


        


    }
    
}
