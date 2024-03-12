public class Employee {
    public static int count;
    private String name;
    public static final double myPi = 3.28;

    public Employee(String name) {
        this.name = name;
        count++;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        Employee.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMyPi() {
        return myPi;
    }
}
