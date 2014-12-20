/**
 * Created by Pierre on 20/12/2014.
 */
public class UserImpl implements User{

    private String userName;
    private int libraryID;

    public UserImpl(String name) {
        userName = name;
    }

    @Override
    public String getUserName() {
        return(userName);
    }

    @Override
    public int getLibraryID() {
        return(libraryID);
    }

    @Override
    public void setLibraryID(int number) {
        libraryID = number;
    }

}
