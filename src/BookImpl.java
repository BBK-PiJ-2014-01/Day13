/**
 * Created by PierreM on 17/12/2014.
 */
public class BookImpl implements Book {

    private String title;
    private String author;

    public BookImpl(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String getTitle() {
        return(title);
    }

    @Override
    public String getAuthor() {
        return(author);
    }
}
