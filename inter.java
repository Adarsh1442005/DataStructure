 interface inte {
   static  int a=2;
    static  int add(){
        return 1;
    };

    
}
class A implements inte{
   
   


}
public class inter{
  public static void main(String args[]) {
    A obj1=new A();
    A obj2=new A();
    System.out.println(obj1.a);
    System.out.println(obj2.a);
    
    
    


  }


}
