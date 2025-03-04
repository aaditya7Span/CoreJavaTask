package corejava.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("Hello");
        list.add("gethere");
        list.add(10,11);

        System.out.println(list.get(0));
    }
}
