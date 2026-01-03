public class EmployeePayrollMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;
        int MAX_WORKING_DAYS = 20;
        int MAX_WORKING_HOURS = 100;

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
