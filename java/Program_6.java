


interface Demo1{
    public void test();
    public void test1();
}
class Demo2 implements Demo1{
    public void test(){
        System.out.println("Hello Java");
    }

    
}
class Demo3 implements Demo1{
    public void test1(){
        System.out.println("Hello jelly");
    }
}


public class Program_6 {
    public static void main(String args[]){
    Demo3 d3=new Demo3();
    Demo2 d2=new Demo2();
    d3.test();
    d2.test1();
    }
}