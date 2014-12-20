import org.junit.Test;

/**
 * Created by Pierre on 20/12/2014.
 */

import org.junit.*;
import static org.junit.Assert.*;

public class TestUser {

    @Test
    public void testsUserName() {
        User u = new UserImpl("Pierre Meyer");
        String output = u.getUserName();
        String expected = "Pierre Meyer";
        assertEquals(output, expected);
    }

    @Test
    public void testsUserLibraryID() {
        User u = new UserImpl("Pierre Meyer");
        u.setLibraryID(10);
        int output = u.getLibraryID();
        int expected = 10;
        assertEquals(output, expected);
    }

}