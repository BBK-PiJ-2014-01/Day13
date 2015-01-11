/**
 * Created by Pierre on 20/12/2014.
 */

import org.junit.*;
import static org.junit.Assert.*;

public class TestBook {

    @Test
    public void testsBookName() {
        Book b = new BookImpl("The Lord of the Rings", "JRR Tolkien");
        String output = b.getTitle();
        String expected = "The Lord of the Rings";
        assertEquals(expected, output);
    }

    @Test
    public void testsBookAuthor() {
        Book b = new BookImpl("The Lord of the Rings", "JRR Tolkien");
        String output = b.getAuthor();
        String expected = "JRR Tolkien";
        assertEquals(expected, output);
    }

}
