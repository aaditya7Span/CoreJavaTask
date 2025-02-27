package corejava.overloading;
//Changing Data Types of the Arguments
public class Overloading2 {
    public static void printdata(int i,int j,int k){
        System.out.println(i+" hello "+j+" get "+k);
    }

    public static void printdata(double i,double j){
        System.out.println(i+" gethere "+j+" okdone");
    }

    public static void main(String[] args) {
        Overloading2 overloaing2=new Overloading2();

        overloaing2.printdata(10,20,30);
        overloaing2.printdata(1.2,3.2);
    }
}
