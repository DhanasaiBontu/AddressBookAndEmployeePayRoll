public class EmployeePayrollMain {

    // UC7: Class Variables (Constants)
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static final int EMP_RATE_PER_HOUR = 20;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        // UC7: Call class method
        computeEmployeeWage();
    }

    // UC7: Class Method
    public static void computeEmployeeWage() {

        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs < MAX_WORKING_HOURS && totalWorkingDays < MAX_WORKING_DAYS) {

            totalWorkingDays++;

            int empCheck = (int) Math.floor(Math.random() * 3);
            int empHrs = 0;

            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    System.out.println("Day " + totalWorkingDays + ": Employee is Full Time");
                    break;

                case IS_PART_TIME:
                    empHrs = 4;
                    System.out.println("Day " + totalWorkingDays + ": Employee is Part Time");
                    break;

                default:
                    empHrs = 0;
                    System.out.println("Day " + totalWorkingDays + ": Employee is Absent");
            }

            totalEmpHrs += empHrs;
        }

        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;

        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalEmpHrs);
        System.out.println("Total Employee Wage: " + totalEmpWage);
    }
}
