package java8.functionalinterface;

@FunctionalInterface
public interface MyInterface {
    void print();
    static void getData() {

    }
    default void remove(){

    }
//    void printdata(); can have only exatcly one abstract method and as many as we want default and static methods
}
