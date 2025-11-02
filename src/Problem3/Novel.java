package Problem3;

public class Novel extends Book{
    public double price;

    public Novel(String title, int numRec, String author, int nbrPages, double price) {
        super(title, numRec, author, nbrPages);
        this.price = price;
    }

    @Override
    public String toString(){
        return "[NovelBook: "+author+" , "+title+" , "+numRec+" , "+nbrPages+" , "+price+"]";
    }
}
