public class Employee {
    double basePay;
    double overtimePay;
    int overtimeHours;
    int hoursWorked;
    int baseHours;

    public Employee(double basePay, int hoursWorked) {
        this.basePay = basePay;
        this.hoursWorked = hoursWorked;
        this.overtimePay = basePay * 1.5;
    }

    public boolean validWage() throws Exception {
        if (this.basePay < 8) {
            throw new Exception("Wage isn't valid");
        }
        return true;
    }
    public boolean validHours() throws Exception {
        if (this.hoursWorked > 60) {
            throw new Exception("Hours aren't valid");
        }
        return true;
    }

    public int overtimeHours() {
        if (this.hoursWorked > 40) {
            this.overtimeHours = (this.hoursWorked - 40);
            return this.overtimeHours;
        }
        return 0;
    }

    public int baseHours() {
        overtimeHours();
        this.baseHours = this.hoursWorked - this.overtimeHours;
        return this.baseHours;
    }

    public double totalPay() {
        baseHours();
        try {
            validWage();
            validHours();
        } catch(Exception e) {
            System.out.println("Error"+e);
        }
        double totalPay = this.basePay * this.baseHours + this.overtimePay * this.overtimeHours;
        return totalPay;
    }
}