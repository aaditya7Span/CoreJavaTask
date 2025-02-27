package java8.comparaterinter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Test implements Comparator<String> {

    //without lamda function
    @Override
    public int compare(String s1, String s2) {
        return s2.compareTo(s1);
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("get");
        arrayList.add("hello");
        arrayList.add("alpha");
        arrayList.add("poki");
        arrayList.add("paki");

        System.out.println(arrayList);
        long l = System.currentTimeMillis();
        Collections.sort(arrayList,(s1,s2) -> s2.compareTo(s1)); //with lamda function [arrylist ,new Test()]
        long s = System.currentTimeMillis();
        System.out.println(arrayList);
        System.out.println(s-l);


    }
}
