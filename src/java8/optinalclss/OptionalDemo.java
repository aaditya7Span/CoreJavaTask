package java8.optinalclss;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
//for null pointer exception problem
    String str="efeffefe";
    Optional<String> optional=Optional.ofNullable(str);
        System.out.println(optional.isPresent());
//        System.out.println(optional.get());
        System.out.println(optional.orElse(str));
    }
}
