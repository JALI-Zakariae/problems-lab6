package Problem3;

public class Magazine extends Document {
    private String month;
    private int year;

    public Magazine(String title, int numRec, String month, int year) {
        super(title, numRec);
        this.month = month;
        this.year = year;
    }
    @Override
    public String toString(){
        return "[Magazine: "+title+" , "+numRec+" , "+month+" , "+year+"]";
    }
}
