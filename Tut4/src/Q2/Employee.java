package Q2;
import T3.Date;
public abstract class Employee {

    private String employeeId;
    private String firstName;
    private String lastName;
    private Date DOB;

    public Employee(String employeeId, String firstName, String lastName, Date DOB) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }


}
