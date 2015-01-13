/**
 * Created by PierreM on 12/01/2015.
 */
public interface Library {
    /**
     * Returns the maximum number of books borrowed by the same person
     *
     * @return maximum number of books borrowed by the same person
     */
    int getMaxBooksPerUser();

    /**
     * Sets the maximum number of books borrowed by the same person
     *
     * @param number maximum number of books that can be borrowed by the same person
     */
    void setMaxBooksPerUser(int number);

    /**
     * Returns the ID of a person for a given name in this library.
     * If the person does not have an ID yet, a new unique ID is created and returned
     *
     * @return the ID of a person for a given name in the library
     * @param name name of the person for which we want the libraryID
     */
    int getID(String name);

    /**
     * Returns the library name
     *
     * @return the library name
     */
    String getLibrary();
}
