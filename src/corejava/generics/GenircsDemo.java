package corejava.generics;

import java.util.ArrayList;


public class GenircsDemo {
    public static void main(String[] args) {
      ArrayList arrayList = new ArrayList();
        int a=1234;
        int j=23;
        int k=90;
        arrayList.add(a);
        arrayList.add(j);
        arrayList.add("gello9");

        System.out.println(arrayList.remove(0).getClass());
        k=(int)arrayList.remove(0);

        Integer b=30;
        int c=10;
        b=c;
        System.out.println(c);

    }
}
