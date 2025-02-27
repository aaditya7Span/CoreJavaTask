package corejava.overriding;

public class OverridingDemo {
    public static void main(String[] args) {
        DemoClass1 demoClass1=new DemoClass1();
        demoClass1.m1();
        DemoClass2 demoClass2 =new DemoClass2();
        demoClass2.m1();
    }
}

class  DemoClass1{
     void m1(){
        System.out.println("class1");
    }
}

class DemoClass2 extends DemoClass1{
    void m1(){
        System.out.println("class2");
    }
}
