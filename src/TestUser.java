import org.junit.Test;

/**
 * Created by Pierre on 20/12/2014.
 */

import org.junit.*;
import static org.junit.Assert.*;

public class TestUser {

    User user;
    Library library;

    @Before
    public void buildUp() {
        user = new UserImpl("Pierre Meyer");
        library = new LibraryImpl("MainLibrary");
    }

    @Test
    public void testsUserName() {
        String output = user.getUserName();
        String expected = "Pierre Meyer";
        assertEquals(output, expected);
    }

    @Test
    public void testsUserLibraryID() {
        user.setLibraryID(10);
        int output = user.getLibraryID();
        int expected = 10;
        assertEquals(output, expected);
    }

    @Test
    public void tests_register() {
        user.register(library);
        int expected = 5;
        assertEquals(expected,user.register(library));
    }

}