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
        String firstname = "Lia";
        String lastname = "Andersson";
        int age = 56;
        double monthSalary = 35000;
        testObject = new Employee("Lia","Andersson", 56,35000);

        Assertions.assertEquals(firstname, ((String) ReflectionTestUtils.getField(testObject,"firstname")));
        Assertions.assertEquals(lastname, ((String) ReflectionTestUtils.getField(testObject,"lastname")));
        Assertions.assertEquals(age,((Integer) ReflectionTestUtils.getField(testObject,"age")),0 );
        Assertions.assertEquals(monthSalary,((Double) ReflectionTestUtils.getField(testObject,"monthSalary")));
    }

    @Test
    public void returnGetFirstname(){
        testObject = new Employee("Jonas");

        Assertions.assertEquals("Jonas",testObject.getFirstName());

    }


    @Test
    public void returnSetFirstname(){
        testObject = new Employee("Peter");
        testObject.setFirstname("Peter");
        String actual = testObject.getFirstName();

        Assertions.assertEquals("Peter",actual );
    }
}
