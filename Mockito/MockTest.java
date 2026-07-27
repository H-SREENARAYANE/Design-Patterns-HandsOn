import static org.mockito.Mockito.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class MockTest {

    @Test
    public void testMock() {

        java.util.List<String> list = mock(java.util.List.class);

        when(list.get(0)).thenReturn("Hello");

        assertEquals("Hello", list.get(0));

        System.out.println("Mocking Successful");
    }
}