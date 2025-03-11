class Employee{
    public String employeeID;
    protected String department;
    private int salary;


    protected Employee(String employeeID, String department, int salary){
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public int accessSalary(){
        return this.salary;
    }

    public void modifySalary(int updatedSalary){
        this.salary = updatedSalary;
    }
}

class Manager extends Employee{

    public Manager(String employeeId, String department, int salary){
        super(employeeId,department,salary);
    }

    public void display(){
        System.out.println("EmployeeId of the employee is " + employeeID);
        System.out.println("Department of the employee is " + department);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Manager employee = new Manager("2110990642", "Bank Locker", 10000);
        employee.display();
        employee.modifySalary(90000);
        System.out.println(employee.accessSalary());
        employee.display();

//        EmployeeId of the employee is 2110990642
//        Department of the employee is Bank Locker
//        90000
//        EmployeeId of the employee is 2110990642
//        Department of the employee is Bank Locker
    }
}