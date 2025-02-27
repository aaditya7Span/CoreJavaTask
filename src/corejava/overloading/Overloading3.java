package corejava.overloading;
//Changing the Order of the Parameters of Methods
public class Overloading3 {
    public static void seedata(int i,String s1){
        System.out.println(i+" hello "+s1+" get ");
    }

    public static void seedata(String s1,int i){
        System.out.println(i+" gethere "+s1+" okdone");
    }

    public static void main(String[] args) {
        Overloading3 overloaing3=new Overloading3();

        overloaing3.seedata(10,"hello");
        overloaing3.seedata("hello",10);
    }
}
