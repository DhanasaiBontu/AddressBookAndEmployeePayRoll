public class EmployeePayrollMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int IS_PRESENT = 1;
        int EMP_RATE_PER_HOUR = 20;
        int FULL_DAY_HOURS = 8;

        int empCheck = (int) Math.floor(Math.random() * 2);
        int empWage = 0;

        if (empCheck == IS_PRESENT) {
            System.out.println("Employee is Present");
            empWage = EMP_RATE_PER_HOUR * FULL_DAY_HOURS;
        } else {
            System.out.println("Employee is Absent");
            empWage = 0;
        }

        System.out.println("Daily Employee Wage: " + empWage);
    }
}
