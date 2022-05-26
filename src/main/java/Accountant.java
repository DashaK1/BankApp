public class Accountant extends Employee {
    public Accountant(String employeeName, int employeeId, String employeeDateOfBirth, String employeeAddress) {
        super(employeeName, employeeId, Consts.ACCOUNTANT_DEFAULT_SALARY, Consts.ACCOUNTANT_TYPE, employeeDateOfBirth, employeeAddress);
    }

    public void createReport(String employeeName) {
        System.out.println(String.format("Accountant %s will prepare the report", employeeName));
        System.out.println("Accountant will prepare the report");

    }

    public void openNewAccount(){
    }
    public void closeAccount(){
    }
}
