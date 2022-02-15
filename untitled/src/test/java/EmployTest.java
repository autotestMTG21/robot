import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class EmployTest {

    Employee testObject;

    @BeforeEach
    public void beforeEach(){
        System.out.println("This happens before each test in this class");

    }

    // @BeforeAll Happens once before tests
    @BeforeAll
    public static void beforeAll(){
        System.out.println("This happens before all tests in this class");
    }

    //  @AfterEach Happens after each test
    @AfterEach
    public void afterEach(){
        System.out.println("This happens after each test in this class");
    }

    // @AfterAll  Happens once after tests
    @AfterAll
    public static void afterAll(){
        System.out.println("This is the last thing that is run before the test class is finished");
    }
}
