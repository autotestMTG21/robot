import org.junit.jupiter.api.*;
import org.springframework.test.util.ReflectionTestUtils;

public class EmployTest {

    Employee testObject1;
    Employee testObject2;
    Employee testObject3;
    EmployeeSystem test1;
    EmployeeSystem test2;
    EmployeeSystem test3;

    @BeforeEach
    public void beforeEach(){
        testObject1 = new Employee("Ella","Noren",25,25000);
        testObject2 = new Employee("Sara","Lundgren",35,30000);
        testObject3 = new Employee("Petra","Eriksson",45,40000);
        test1 = new EmployeeSystem();
        test2 = new EmployeeSystem();
        test3 = new EmployeeSystem();

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
    public void returnEmployeeConstr(){

        Assertions.assertEquals("Ella", ((String) ReflectionTestUtils.getField(testObject1,"firstname")));
        Assertions.assertEquals("Noren", ((String) ReflectionTestUtils.getField(testObject1,"lastname")));
        Assertions.assertEquals(25,((Integer) ReflectionTestUtils.getField(testObject1,"age")),0 );
        Assertions.assertEquals(25000,((Double) ReflectionTestUtils.getField(testObject1,"monthSalary")));
    }

    @Test
    public void returnGetId(){
        int expected = 1;
        int actual = testObject1.getId();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void returnGetFirstname(){
        String expected = "Sara";
        String actual = testObject2.getFirstName();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void returnSetFirstname(){
        String expected = "Ella";
        String actual = testObject1.getFirstName();
        testObject1.setFirstname(expected);

        Assertions.assertEquals(expected,actual );
    }

    @Test
    public void returnGetLastname(){
        String expected = "Lundgren";
        String actual = testObject2.getLastname();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void returnSetLastname(){
        String expected = "Eriksson";
        String actual = testObject3.getLastname();
        testObject3.setLastname(expected);

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void returnGetAge(){
        int expected = 45;
        int actual = testObject3.getAge();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void returnSetAge(){
        int expected = 25;
        int actual = testObject1.getAge();
        testObject1.setAge(expected);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void returnGetMonthSalary(){
        double expected = 30000;
        double actual = testObject2.getMonthSalary();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void returnSetMonthSalary(){
        double expected = 40000;
        double actual = testObject3.getMonthSalary();
        testObject3.setMonthSalary(expected);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void returnAddEmployee(){
        for (Employee employeeList : test1.addEmployee(testObject1)) {
            Assertions.assertEquals("Ella Noren",employeeList.getFirstName()+" "+employeeList.getLastname());
            Assertions.assertEquals(25,employeeList.getAge());
            Assertions.assertEquals(25000,employeeList.getMonthSalary());
        }


    }

    @Test
    public void returnRemoveEmployee(){


    }


}
