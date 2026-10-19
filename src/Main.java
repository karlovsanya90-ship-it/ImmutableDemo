import java.util.Date;

public class Main {
    public static void main(String[] args){
        Date originalDate = new Date();
        Employee employee = new Employee("Вассилий", originalDate);

        System.out.println("До взлома: " + employee);

        originalDate.setTime(0);
        Date stolenDate = employee.getHireDate();
        stolenDate.setTime(0);

        System.out.println("После взлома: " + employee);
    }
}