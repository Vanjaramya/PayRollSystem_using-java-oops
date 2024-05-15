package employeePayrollSystem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PayrollEmployee payrollSystem = new PayrollEmployee();

FullTimeEmployee emp1 = new FullTimeEmployee("John doe",101,5000.0);
PartTimeEmployee emp2 = new PartTimeEmployee("Jane Smith",102,30,15.0);


payrollSystem.addEmployee(emp1);
payrollSystem.addEmployee(emp2);


System.out.println("Intial Emplyee Details:");
payrollSystem.displayEmployees();

System.out.println("\nRemoving Employee...");
payrollSystem.removeEmployee(101);

System.out.println("\nRemaining Employee details...");
payrollSystem.displayEmployees();
	}

}
