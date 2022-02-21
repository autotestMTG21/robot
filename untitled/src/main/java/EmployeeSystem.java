import java.util.ArrayList;

public class EmployeeSystem {

    ArrayList<Employee> employeeList = new ArrayList<Employee>();

    public EmployeeSystem(){

    }

    public ArrayList<Employee> addEmployee(Employee employee){
        employeeList.add(employee);
        return employeeList;
    }

    public ArrayList<Employee> deleteEmployeeById(int id) {

        employeeList.remove(id);
        return employeeList;

    }

}
