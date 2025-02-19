package corejava.designpattern.prototype;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeDemo prototypeDemo=new PrototypeDemo();
        prototypeDemo.print();

        PrototypeDemo clone =(PrototypeDemo) prototypeDemo.clone();
        clone.print();

    }
}
