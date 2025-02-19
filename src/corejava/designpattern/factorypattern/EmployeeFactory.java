package corejava.designpattern.factorypattern;

public class EmployeeFactory {
    public static Employee getEmployee(String str){
        if(str=="androiddev"){
            return new Androiddeveloper();
        }
        else if (str=="webdev"){
            return new Webdeveloper();
        }
        else{
            return null;
        }
    }
}
