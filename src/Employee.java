public class Employee {
    public  int Employee_ID;
    private String lastName;
    private String FirstName;
    private String Role;
    private String Department;
    private int Phone_Number;
    private double Salary;

    public Employee(int employee_ID, String lastName, String firstName, String role, String department, int phone_Number, double salary) {
        Employee_ID = employee_ID;
        this.lastName = lastName;
        FirstName = firstName;
        Role = role;
        Department = department;
        Phone_Number = phone_Number;
        Salary = salary;
    }

    public int getEmployee_ID() {
        return Employee_ID;
    }

    public void setEmployee_ID(int employee_ID) {
        Employee_ID = employee_ID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public int getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(int phone_Number) {
        Phone_Number = phone_Number;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Employee_ID=" + Employee_ID +
                ", lastName='" + lastName + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", Role='" + Role + '\'' +
                ", Department='" + Department + '\'' +
                ", Phone_Number=" + Phone_Number +
                ", Salary=" + Salary +
                '}';
    }
}
