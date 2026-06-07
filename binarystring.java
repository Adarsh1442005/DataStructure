import java.util.*;
import java.io.*;
public class binarystring {
  public static void binary_str(int length,int last,int currind,String str){
    if(currind==length){
      if(last==1){
        System.out.println(str+"0");
      }
      else{
        System.out.println(str+"0");
        System.out.println(str+"1");

      }
      return;
    }
    if(last==0){
      binary_str(length,0,currind+1,str.concat("0"));
      binary_str(length, 1, currind+1, str.concat("1"));
     }
     else{
      binary_str(length,0,currind+1,str.concat("0"));
     }
     




  }
  public static void main(String args[]) throws IOException{
    BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter the length of binary string");
    int length=Integer.parseInt(obj.readLine());
    binary_str( length,0,1,new String(""));


  }
  
}
