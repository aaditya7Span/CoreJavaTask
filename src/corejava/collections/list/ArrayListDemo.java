package corejava.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//List (ArrayList, LinkedList, Vector, Stack) → Ordered, allows duplicates.
//Set (HashSet, LinkedHashSet, TreeSet) → Unordered, no duplicates.
//Queue (PriorityQueue, LinkedList, Deque) → Follows FIFO (First In First Out).
//Map (HashMap, LinkedHashMap, TreeMap, Hashtable) → Key-Value pairs.


public class ArrayListDemo {
    public static void main(String[] args) {

        //Using List interface  1-way
        List list = new ArrayList();
        list.add(10);
        list.add("Hello");
        list.add(10.1);

        //2-way
        list = new LinkedList<>(list);
        list.add("hello");
        list.add(10);

        System.out.println(list);
        //3-way generics
        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
//        list1.add(10);

        //4-way generics not which child
        list1 = new LinkedList();
        list1.add("10");
//        list1.add(10);


        //Using ArrayList interface 1-way
        ArrayList arrayList = new ArrayList();
        arrayList.add("Hello");
        arrayList.add(190);

        //        arrayList=new LinkedList();

        //2-way generics
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("HEllo");
        arrayList1.add("Gethere");
        arrayList1.add("overthere");
        //        arrayList1.add(10);


        //Methods of Arraylist

        /*
        add(E e)	                                    Adds an element to the list.
        add(int index, E element)	                    Inserts an element at a specific position.
        addAll(Collection<? extends E> c)	            Adds all elements from a collection.
        addAll(int index, Collection<? extends E> c)	Inserts all elements from a collection at a specific index.
        clear()	                                        Removes all elements from the list.
        contains(Object o)	                            Checks if the list contains a specific element.
        containsAll(Collection<?> c)	                Checks if the list contains all elements from a collection.
        equals(Object o)	                    Compares two lists for equality.
        get(int index)	                        Retrieves the element at a given index.
        hashCode()	                            Returns the hash code for the list.
        indexOf(Object o)	                    Returns the index of the first occurrence of an element.
        isEmpty()	                            Checks if the list is empty.
        iterator()	                            Returns an iterator over the elements.
        lastIndexOf(Object o)	                Returns the index of the last occurrence of an element.
        listIterator()	                        Returns a list iterator for traversing elements.
        listIterator(int index)	                Returns a list iterator starting from the given index.
        remove(int index)	                    Removes an element at a given index.
        remove(Object o)	                    Removes the first occurrence of an element.
        removeAll(Collection<?> c)	            Removes all elements from the collection that match the list.
        retainAll(Collection<?> c)	            Retains only elements that are in the given collection.
        set(int index, E element)	            Replaces an element at a specified position.
        size()	                                Returns the number of elements in the list.
        subList(int fromIndex, int toIndex)	    Returns a sublist from a specified range.
        toArray()	                            Converts the list into an array.
        toArray(T[] a)                          Converts the list into an array of type T.
        */

    }
}
