public abstract class Employee {
    private String name;
    private int id;
    private int salary;
    private String position;
    private String dateOfBirth;
    private String address;

    public Employee(String employeeName, int employeeId, int employeeSalary,String employeePosition, String employeeDateOfBirth, String employeeAddress){
        this.name = employeeName;
        this.id =employeeId;
        this.salary = employeeSalary;
        this.position = employeePosition;
        this.dateOfBirth = employeeDateOfBirth;
        this.address = employeeAddress;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
         return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void receiveSalary(){
        System.out.println("The salary was sent to the employee bank account");
    }

    public String toString(){
        String txt = String.format("Employee name: %s, position: %s, salary: %d, dateOfBirth: %s, Address: %s", name,position,salary,dateOfBirth,address);
        return txt;
    }

}
