package Heap;
import java.util.*;
import java.io.*;
class Car implements Comparable<Car>{
    int x;
    int y;
    int dis;
    public void calcdist(){
        dis=(x*x)+(y*y);

 }
    public Car(int x,int y){
        this.x=x;
        this.y=y;
        calcdist();
    }
    public int compareTo(Car car){
    return this.dis-car.dis;
    }


}

public class nearestcar {
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of cars:");
        int num=Integer.parseInt(obj.readLine());
        PriorityQueue<Car> qu=new PriorityQueue();
        for(int i=0;i<num;i++){
            System.out.println("enter the x coordinate:");
            int x=Integer.parseInt(obj.readLine());
            System.out.println("enter the Y coordinate");
            int y=Integer.parseInt(obj.readLine());
            Car car=new Car(x,y);
            qu.add(car);



        }
        System.out.println("enter the number of nearest car need: ");
        int k=Integer.parseInt(obj.readLine());
       for(int i=0;i<k;i++){
        Car c=qu.remove();
         
        System.out.println(c.dis);

       }


    }
    
}
