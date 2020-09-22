public class FooCorporation {

    public static void main(String[] args) {
        Employee a = new Employee(7.5, 35);
        Employee b = new Employee(8.2, 47);
        Employee c = new Employee(10, 73);
        System.out.println(a.totalPay());
        System.out.println(b.totalPay());
        System.out.println(c.totalPay());
    }
}
