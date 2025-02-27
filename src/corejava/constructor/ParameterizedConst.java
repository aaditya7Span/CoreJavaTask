package corejava.constructor;

public class ParameterizedConst {
    public static void main(String[] args) {
        Demo demo=new Demo("This is Parameterized constructor");
    }
}
class Demo{
    int i;
    Demo(String s1){
        System.out.println(s1);
    }
}
