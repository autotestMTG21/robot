import org.junit.jupiter.api.*;

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
    public void returnEmployeeName(){
        testObject = new Employee();
    }
}
