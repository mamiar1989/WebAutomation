
    import java.util.Scanner;

    public class EmployeeInfo extends EmployeeInformation implements Employee {

        //Declare some static and final fields and some non-static fields:
        static String name;
        static int depId=100;
        String companyName;
        private int salary;
        private String SSN;
        private String phoneN="215/4345/567";
        private int empId=447;
        final String DOB="10/31/1979";



        // declare some methods:
        public static void paidSickDays(){
            System.out.println("Employee get paid for sick days");
        }

        public static void paidVacations(){
            System.out.println("Employee can get a paid vacations");
        }

        /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
         * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
         * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
         * go to FortuneEmployee class to apply all the fields and attributes.
         *
         * Important: YOU MUST USE the
         * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
         * Use all kind of keywords(super,this,static,final........)
         * Implement Nested class.
         * Use Exception Handling.
         *
         */

	/*
	 //declare few static and final fields and some non-static fields



	/*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

        /*
         * you must have multiple constructor.
         * Must implement below constructor.
         */
        public EmployeeInfo(int employeeId) {

        }

        public EmployeeInfo(String name, int employeeId) {

        }
        public EmployeeInfo(String name , int employeeId, int employeeDep){
            this.empId=employeeId;
            this.name=name;
            this.depId=employeeDep;

        }

        public EmployeeInfo(String name, int employeeId,int employeeDep, String SSN, String dob){
            this.depId=employeeDep;
            this.empId=employeeId;
            this.SSN=SSN;

        }

        public EmployeeInfo(String companyName,int salary,String SSN,int empId,String phoneN) {
            this.companyName = companyName;
            this.salary=salary;
            this.SSN=SSN;
            this.empId=empId;
            this.phoneN=phoneN;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public int getEmpId() {
            return empId;
        }

        public void setEmpId(int empId) {
            this.empId = empId;
        }

        public static String getName() {
            return name;
        }

        public static void setName(String name) {
            EmployeeInfo.name = name;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public static int getDepId() {
            return depId;
        }

        public static void setDepId(int depId) {
            EmployeeInfo.depId = depId;
        }

        public String getPhoneN() {
            return phoneN;
        }

        public void setPhoneN(String phoneN) {
            this.phoneN = phoneN;
        }

        public String getSSN() {
            return SSN;
        }

        public void setSSN(String SSN) {
            this.SSN = SSN;
        }

        public String getDOB() {
            return DOB;
        }


        /*
         * This methods should calculate Employee bonus based on salary and performance.
         * Then it will return the total yearly bonus. So you need to implement the logic.
         * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
         * You can set arbitrary number for performance.
         * So you probably need to send 2 arguments.
         *
         */
        public static int calculateEmployeeBonus(int numberOfYearsWithCompany) {
            int total = 0;
            return total;
        }

        /*
         * This methods should calculate Employee Pension based on salary and numbers of years with the company.
         * Then it will return the total pension. So you need to implement the logic.
         * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
         *
         */
        public static int calculateEmployeePension() {
            int total = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter start date in format (example: May,2015): ");
            String joiningDate = sc.nextLine();
            System.out.println("Please enter today's date in format (example: August,2017): ");
            String todaysDate = sc.nextLine();
            //   String convertedJoiningDate = DateConversion.convertDate(joiningDate);
            // String convertedTodaysDate = DateConversion.convertDate(todaysDate);

            //implement numbers of year from above two dates
            //Calculate pension


            return total;
        }

        public int employeeId() {
            return 0;
        }

        public String employeeName() {
            return null;
        }

        public void assignDepartment() {

        }

        public int calculateSalary() {
            return 0;
        }

        public void benefitLayout() {

        }

        public int employeeAddress() {
            return 0;
        }

        public void employeeAge() {

        }

        public void employeeEngagement() {

        }

        public void employeePromotion() {

        }

        public String employeeRelations() {
            return null;
        }

        public void getExtraBenefit() {

        }


        public void getPromotion(){

        }

    }
