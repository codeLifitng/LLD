package Factory;

public class EmployeeFactory {
    //Factory method
    //produced object of Employees based on the param
    public static Employee getEmployeeObject(String input) {
        return switch (input) {
            case "Android" -> new AndroidDeveloper();
            case "Web" -> new WebDeveloper();
            default -> throw new IllegalArgumentException("Invalid parameter");
        };
    }
}
