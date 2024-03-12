public class Main {
    public static void main(String[] args){

        System.out.println("count:" + Employee.count);

        Employee employee1 = new Employee("Bob Harley");

        System.out.println("count:" + Employee.count);

        Employee employee2 = new Employee("sss");

        System.out.println("count:" + Employee.count);
        System.out.println("count:" + employee1.getCount());
        System.out.println("count:" + employee2.getCount());

        System.out.println("pi:" + Employee.myPi);
        System.out.println("pi:" + employee1.getMyPi());
        System.out.println("pi:" + employee2.getMyPi());
    }
}
