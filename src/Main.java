import java.awt.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

interface Testing {
    void hello(String s);
}
class method implements Testing{

    @Override
    public void hello(String s) {

    }
    void m1(String s){
        System.out.println("Hi");
    }
     void m1(Integer i){
        System.out.println("Bye");
    }
}
public class Main {

    public static void main(String[] args) {

        Testing t = (s) -> System.out.println("Hello " + s);
        method m=new method();

        t.hello("R");
        m.m1((String) null);
        Map<String,Double> map=new HashMap<>();
        map.put("a",100.0);
        map.put("b",300.0);
        map.put("c",200.0);
        map.put("d",200.0);
        map.put("e",400.0);
        Map.Entry<String,Double>s=map.entrySet().stream().sorted(Map.Entry.<String,Double>comparingByValue(Comparator.reverseOrder())).skip(2).findFirst().orElse(null);
        System.out.println("Third Highest"+s);
       int n=98;
        try{
            int sum=n/0;
        }catch(NullPointerException ex){
            System.out.println("NullPointer");
        }

        catch(Exception e){
            System.out.println("Test");
        }




        

    }
}