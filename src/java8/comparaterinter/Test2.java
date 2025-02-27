package java8.comparaterinter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    String name;
    Integer e_id;
    String email;

    public Test2(String name, Integer e_id, String email) {
        this.name = name;
        this.e_id = e_id;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Test2{" +
                "name='" + name + '\'' +
                ", e_id=" + e_id +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Test2> test2s=new ArrayList<>();

        test2s.add(new Test2("aadi",123,"hell@gmail.com"));
        test2s.add(new Test2("rajat",342,"omg@gmail.com"));
        test2s.add(new Test2("vipul",12,"makework@gmail.com"));
        test2s.add(new Test2("narayan",665,"getout@gmail.com"));
        test2s.add(new Test2("pankaj",854,"chair@gmail.com"));
        test2s.add(new Test2("vansh",926,"window@gmail.com"));
        System.out.println(test2s);
        Collections.sort(test2s,(ob1,ob2) -> ob1.e_id<ob2.e_id ? -1 : ob1.e_id>ob2.e_id ? 1:0);
        System.out.println(test2s);
        Collections.sort(test2s,(ob1,ob2) -> ob1.name.compareTo(ob2.name));
        System.out.println(test2s);

    }
}
