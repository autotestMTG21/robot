import java.util.ArrayList;

public class EmployeeSystem {

    ArrayList<Employee> employeeList = new ArrayList<Employee>();

    public EmployeeSystem(){

    }

    public ArrayList<Employee> addEmployee(Employee employee){
        employeeList.add(employee);
        return employeeList;
    }

    /*public ArrayList<Employee> deleteEmployeeById(Employee employee) {
        employeeList.remove(employee.getId());
        return employeeList;

    }*/

}
