package corejava.constructor;

public class CopyConst {
    public static void main(String[] args) {
        CopyDemo copyDemo1=new CopyDemo(10,"Copyis here");
        System.out.println(copyDemo1.i);
        CopyDemo copyDemo2=new CopyDemo(copyDemo1);
        System.out.println(copyDemo2.i);
    }
}

class CopyDemo{
    int i;
    String s1;
    CopyDemo(int i, String s1){
        this.i=i;
        this.s1=s1;
    }

    CopyDemo(CopyDemo obj1){
        this.i=obj1.i;
        this.s1=obj1.s1;
    }
}
