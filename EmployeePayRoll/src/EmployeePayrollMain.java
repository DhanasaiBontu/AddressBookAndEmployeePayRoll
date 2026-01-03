public class EmployeePayrollMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;
        int NUM_OF_WORKING_DAYS = 20;

        int empHrs = 0;
        int totalEmpWage = 0;

        for (int day = 1; day <= NUM_OF_WORKING_DAYS; day++) {

            int empCheck = (int) Math.floor(Math.random() * 3);

            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    System.out.println("Day " + day + ": Employee is Full Time");
                    break;

                case IS_PART_TIME:
                    empHrs = 4;
                    System.out.println("Day " + day + ": Employee is Part Time");
                    break;

                default:
                    empHrs = 0;
                    System.out.println("Day " + day + ": Employee is Absent");
            }

            int dailyWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage += dailyWage;
        }

        System.out.println("Total Employee Wage for Month: " + totalEmpWage);
    }
}
