import org.junit.Test;
import static org.junit.Assert.*;

public class AAAExample {

    @Test
    public void testAddition() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int sum = a + b;

        // Assert
        assertEquals(30, sum);

        System.out.println("Test Passed");
    }
}