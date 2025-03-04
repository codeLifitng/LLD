package Creational.Factory;

public class WebDeveloper implements  Employee{
    @Override
    public int Salary() {
        System.out.println("Web Developer - ");
        return 100000;
    }
}
