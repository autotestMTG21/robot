import org.junit.jupiter.api.*;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.ArrayList;

public class EmployTest {

    Employee testObject1;
    Employee testObject2;
    Employee testObject3;

    @BeforeEach
    public void beforeEach(){
        testObject1 = new Employee("Ella","Noren",25,25000);
        testObject2 = new Employee("Sara","Lundgren",35,30000);
        testObject3 = new Employee("Petra","Eriksson",45,40000);

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
        int expected = testObject2.getId();
        int actual = testObject1.getId() +1 ;

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
        testObject1.setFirstname(expected);
        String actual = testObject1.getFirstName();

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
}
