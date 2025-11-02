package Problem3;

public class Main {
    public static void main(String[] args){
        Document textBook = new TextBook("DataStructures",5561,"zakariae",441,"Level 2");
        Document textBook2 = new TextBook("DataStructures2",5561,"amine",441,"Level 3");
        Document textBook3 = new TextBook("DataStructures3",5561,"ali",441,"Level 4");
        Document textBook5 = new TextBook("DataStructures4",5561,"karim",441,"Level 5");
        Document novelBook = new Novel("harry potter",4521,"yassine",451,1000);
        Document magazine = new Magazine("magazine1",8521,"September",2004);
        Document dictionary = new Dictionary("la rousse",55451,"Francais");
        Library library = new Library(6);
        library.addDocument(textBook);
        library.addDocument(textBook);
        library.addDocument(novelBook);
        library.addDocument(magazine);
        library.addDocument(dictionary);
        library.addDocument(textBook2);
        library.addDocument(textBook3);
        library.addDocument(textBook5);
        library.displayDocuments();

        library.deleteDocument(textBook);
        library.displayDocuments();
        library.displayAuthors();
    }
}
