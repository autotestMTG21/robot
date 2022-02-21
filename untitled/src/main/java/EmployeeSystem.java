import java.util.ArrayList;

public class EmployeeSystem {

    ArrayList<Employee> employeeList = new ArrayList<Employee>();

    public EmployeeSystem(){

    }

    public ArrayList<Employee> addEmployee(Employee employee){
        employeeList.add(employee);
        return employeeList;
    }

    /*public void deleteEmployee(int id) {
        int index = id -1;
        employeeList.remove(index);

    }*/
    public void deleteEmployee(Employee employee) {

        employeeList.remove(employee);
    }

    public void increaseAllEmployeeMonthSalary(double percentage) {
        if(percentage >0 && percentage <=1){

           for(int i =0; i<employeeList.size();i++){
               double newSalary =employeeList.get(i).getMonthSalary()*(1+percentage);
               employeeList.get(i).setMonthSalary(newSalary);
           }

        }

    }
}
