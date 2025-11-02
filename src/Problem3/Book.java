package Problem3;
public class Book extends Document {
    protected String author;
    protected int nbrPages;

    public Book(String title,int numRec,String author, int nbrPages) {
        super(title,numRec);
        this.author = author;
        this.nbrPages = nbrPages;
    }

}
