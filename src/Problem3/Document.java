package Problem3;

public class Document {
    protected int numRec;
    protected String title;

    public Document( String title,int numRec) {
        this.numRec = numRec;
        this.title = title;
    }

    public int getNumRec() {
        return numRec;
    }

    public String getTitle() {
        return title;
    }
}
