import org.junit.jupiter.api.*;
import org.springframework.test.util.ReflectionTestUtils;

public class EmployTest {

    Employee testObject;

    @BeforeEach
    public void beforeEach(){
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
        String name = "Andersson,Lia";
        int age = 56;
        double monthSalary = 35000;
        testObject = new Employee("Andersson,Lia", 56,35000);

        Assertions.assertEquals(name, ((String) ReflectionTestUtils.getField(testObject,"name")));
        Assertions.assertEquals(age,((Integer) ReflectionTestUtils.getField(testObject,"age")),0 );
        Assertions.assertEquals(monthSalary,((Double) ReflectionTestUtils.getField(testObject,"monthSalary")));
    }

    @Test
    public void returnGetFirstname(){


    }
}
