import org.junit.jupiter.api.*;

import java.util.ArrayList;

public class EmployeeSystemTest {

    Employee testObject1;
    Employee testObject2;
    Employee testObject3;
    EmployeeSystem test;

    @BeforeEach
    public void beforeEach(){
        testObject1 = new Employee("Ella","Noren",25,25000);
        testObject2 = new Employee("Sara","Lundgren",35,30000);
        testObject3 = new Employee("Petra","Eriksson",45,40000);
        test = new EmployeeSystem();


        System.out.println("This happens before each test in this class");
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("This happens before all tests in this class");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("This happens after each test in this class");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("This is the last thing that is run before the test class is finished");
    }

    @Test
    public void returnAddEmployee(){
        ArrayList<Employee> employeeList = new ArrayList<Employee>();

        employeeList = test.addEmployee(testObject1);
        employeeList = test.addEmployee(testObject2);
        employeeList = test.addEmployee(testObject3);

        /*for(int i = 0; i<employeeList.size();i++){
            System.out.println(employeeList.get(i).getId()+employeeList.get(i).getFirstName()+employeeList.get(i).getLastname()+employeeList.get(i).getAge()+employeeList.get(i).getMonthSalary());
        }*/


        Assertions.assertEquals(3,employeeList.size());
        Assertions.assertEquals("Sara",employeeList.get(1).getFirstName());

    }

    @Test
    public void returnDeleteEmployee(){
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        System.out.println(employeeList.size()); // 0

        employeeList = test.addEmployee(testObject1);
        employeeList = test.addEmployee(testObject2);
        employeeList = test.addEmployee(testObject3);

        System.out.println(employeeList.size());// 3

        /*for(int i = 0; i<employeeList.size();i++){
            System.out.println(employeeList.get(i).getId()+employeeList.get(i).getFirstName()+employeeList.get(i).getLastname()+employeeList.get(i).getAge()+employeeList.get(i).getMonthSalary());
        }*/

        System.out.println(testObject1.getId());// 1

        test.deleteEmployee(testObject1);

        System.out.println(employeeList.size()); // 2

        for(int i = 0; i<employeeList.size();i++){
            System.out.println(employeeList.get(i).getId()+employeeList.get(i).getFirstName()+employeeList.get(i).getLastname()+employeeList.get(i).getAge()+employeeList.get(i).getMonthSalary());
        }
        Assertions.assertEquals(2,employeeList.size());
        Assertions.assertEquals("Sara", employeeList.get(0).getFirstName());

    }

    @Test
    public void returnIncreaseAllEmployeeMonthSalary(){
        ArrayList<Employee> employeeList = new ArrayList<Employee>();

        employeeList = test.addEmployee(testObject1);
        employeeList = test.addEmployee(testObject2);
        employeeList = test.addEmployee(testObject3);

        double percentage = 0.25;
        test.increaseAllEmployeeMonthSalary(percentage);

        Assertions.assertEquals(31250,testObject1.getMonthSalary());
        Assertions.assertEquals(37500,testObject2.getMonthSalary());
        Assertions.assertEquals(50000,testObject3.getMonthSalary());
    }

    @Test
    public void returnIncreaseSpecificEmployeeSalary(){
        ArrayList<Employee> employeeList = new ArrayList<Employee>();

        employeeList = test.addEmployee(testObject1);
        employeeList = test.addEmployee(testObject2);
        employeeList = test.addEmployee(testObject3);

        double percentage = 0.5;
        test.increaseSpecificEmployeeSalary(testObject1, percentage);

        Assertions.assertEquals(37500,testObject1.getMonthSalary());

    }


}
