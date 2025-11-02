package Problem3;

public class Dictionary extends Document{
    private String language;

    public Dictionary(String title, int numRec, String language) {
        super(title, numRec);
        this.language = language;
    }
    @Override
    public String toString(){
        return "[Dictionary: "+title+" , "+numRec+" , "+language+" ]";
    }
}
