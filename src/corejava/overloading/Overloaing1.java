package corejava.overloading;

//Changing the Number of Parameters
public class Overloaing1 {
    public static void getMessge(int i,int j,int k){
        System.out.println(i+"hello"+j+"get"+k);
    }

    public static void getMessge(int i,int j){
        System.out.println(i+"gethere"+j+"okdone");
    }

    public static void main(String[] args) {
        Overloaing1 overloaing1=new Overloaing1();

        overloaing1.getMessge(10,20,30);
        overloaing1.getMessge(34,23);

    }
}
