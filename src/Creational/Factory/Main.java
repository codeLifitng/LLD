package Creational.Factory;

public class Main {

    public static void main(String[] args) {
        try {
            Employee employee = EmployeeFactory.getEmployeeObject("Web");
            System.out.println(employee.Salary());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
