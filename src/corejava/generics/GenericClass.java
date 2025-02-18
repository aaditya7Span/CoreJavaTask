package corejava.generics;

class GenericClassDemo <T,K>{
    void show(T v){
        System.out.println(v);
    }

    void cancel(K a){
        System.out.println(a);
    }
}

public class GenericClass{
    public static void main(String[] args) {
        GenericClassDemo genericClassDemo=new GenericClassDemo();
        genericClassDemo.show(12);
        genericClassDemo.cancel("aaditya");
    }
}
