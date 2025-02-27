package corejava.accessmodifier;

public class Private {
    public static void main(String[] args) {
        Demo demo=new Demo();
        demo.printDemo();
        Demo2 demo2=new Demo2();
        demo2.printDemo();
    }
}

class Demo{
    void printDemo(){
        System.out.println("Hello this is private");
    }
}

class Demo2 {
    //private can be accessed
    //private void printDemo(){
    void printDemo() {
        System.out.println("Hello this is private");
    }
}
