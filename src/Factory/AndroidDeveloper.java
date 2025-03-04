package Factory;

public class AndroidDeveloper implements Employee{
    @Override
    public int Salary() {
        System.out.println("Android Developer - ");
        return 50000;
    }
}
