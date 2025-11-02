package Problem3;
import java.util.*;
public class Library {
    private int capacity;
    private List<Document> documents;

    public Library(int capacity) {
        this.capacity = capacity;
        this.documents = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }
    public boolean addDocument(Document document){
        if (!documents.contains(document) && documents.size()<capacity){
            documents.add(document);
            return true;
        }
        else{
            return false;
        }
    }
    public boolean deleteDocument(Document document){
        if (documents.contains(document)){
            documents.remove(document);
            return true;
        }
        else{
            return false;
        }
    }
    public void displayDocuments(){
        System.out.println("======Library's Documents=================");

        for (int i = 0;i<documents.size();i++){
            System.out.println(documents.get(i));
        }
        System.out.println("==========================================");
    }
    public Document document(int numEnrg){
        for (int i = 0;i<documents.size();i++){
            if (documents.get(i).getNumRec() == numEnrg){
                return documents.get(i);
            }
        }
        return null;
    }
    public void displayAuthors(){
        System.out.println("=====Authors======================");
        for (int i = 0;i<documents.size();i++){
            if (documents.get(i) instanceof Book){
                System.out.println(((Book) documents.get(i)).author);
            }
        }
        System.out.println("=====================================");
    }

}
