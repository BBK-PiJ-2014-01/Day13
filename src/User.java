/**
 * Created by Pierre on 20/12/2014.
 */
public interface User {

    /**
     * Returns the name of the user
     *
     * @return the name of the user
     */
    String getUserName();

    /**
     * Returns the library-ID of the user
     *
     * @return the library-ID of the user
     */
    int getLibraryID();

    /**
     * Sets the library-ID of the user
     *
     * @param number the library-ID of the user
     */
    void setLibraryID(int number);

    /**
     * Registers a user to a library
     *
     * @param library the library
     */
    void register(Library library);

    /**
     * Registers a user to a library
     *
     * @return library the library
     */
    Library getLibrary();
}
