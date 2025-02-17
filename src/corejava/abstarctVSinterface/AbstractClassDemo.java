package corejava.abstarctVSinterface;

abstract class AbstractClassDemo {
    int i=0;
    void display(){
        System.out.println("hello");
    }
    static int j=10;
     abstract void getHint();
}

class PlayDemo extends AbstractClassDemo{

    @Override
    void getHint() {
        System.out.println("hello you");
    }

}
