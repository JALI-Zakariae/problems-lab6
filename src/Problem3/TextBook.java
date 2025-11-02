package Problem3;

public class TextBook extends Book{
    public String level;

    public TextBook(String title, int numRec, String author, int nbrPages, String level) {
        super(title, numRec, author, nbrPages);
        this.level = level;
    }
    @Override
    public String toString(){
        return "[TextBook: "+author+" , "+title+" , "+numRec+" , "+nbrPages+" , "+level+"]";
    }
}
