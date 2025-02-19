package corejava.designpattern.factorypattern;

public class Test {
    public static void main(String[] args) {

    Employee employee=EmployeeFactory.getEmployee("webdev");
        System.out.println(employee.salary());
    Employee employee1=EmployeeFactory.getEmployee("androiddev");
        System.out.println(employee1.salary());
    }
}
