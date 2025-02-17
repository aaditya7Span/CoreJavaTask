//package corejava;
//
//
//public class ExceptionHandling {
//
////    try catch
//    public static void main(String[] args) {
//        try {
//            int num = 10 / 0;  // ArithmeticException
//        } catch (ArithmeticException e) {
//            System.out.println("Error: Cannot divide by zero.");
//        }
//    }
//
//
//
////    Multiple catch Blocks
//    public static void main(String[] args) {
//        try {
//            int[] arr = {1, 2, 3};
//            System.out.println(arr[5]);  // ArrayIndexOutOfBoundsException
//        } catch (ArithmeticException e) {
//            System.out.println("Arithmetic Exception Occurred");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Array Index Out of Bounds!");
//        }
//    }
//
//
//
////finally Block
//    public static void main(String[] args) {
//        try {
//            int num = 10 / 0;
//        } catch (Exception e) {
//            System.out.println("Exception: " + e.getMessage());
//        } finally {
//            System.out.println("This block always executes.");
//        }
//    }
//
//
//
////throw Keyword (Manually Throwing Exceptions)
//    static void checkAge(int age) {
//        if (age < 18) {
//            throw new ArithmeticException("Not eligible to vote");
//        } else {
//            System.out.println("You can vote!");
//        }
//    }
//    public static void main(String[] args) {
//        checkAge(16);  // Throws exception
//    }
//
//
//
//
////    throws Keyword (Declaring Exceptions)
//    static void readFile() throws IOException {
//        throw new IOException("File not found!");
//    }
//
//    public static void main(String[] args) {
//        try {
//            readFile();
//        } catch (IOException e) {
//            System.out.println("Exception Handled: " + e.getMessage());
//        }
//    }
//
//
//}