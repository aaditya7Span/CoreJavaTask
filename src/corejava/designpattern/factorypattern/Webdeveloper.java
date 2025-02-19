package corejava.designpattern.factorypattern;

public class Webdeveloper implements Employee{

    @Override
    public int salary() {
        System.out.println("this is webdeveloper salary");
        return 50000;
    }
}
