import java.util.HashMap;

/**
 * Created by PierreM on 12/01/2015.
 */
public class LibraryImpl implements Library {

    private int maxBooksPerUser;
    private String libraryName;
    private HashMap userTable;

    public LibraryImpl(String name) {
        libraryName = name;
    }

    @Override
    public String getLibrary() {
        return(libraryName);
    }

    @Override
    public int getID(String name) {
        return(5);
    }

    @Override
    public int getMaxBooksPerUser() {
        return(maxBooksPerUser);
    }

    @Override
    public void setMaxBooksPerUser(int number) {
        maxBooksPerUser = number;
    }
}
