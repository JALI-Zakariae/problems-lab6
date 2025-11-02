
package problem5;
import java.util.*;

public class BookQueue {
    List<Book> queue;
    public BookQueue(){
        queue = new LinkedList<>();

    }
    public void enqueue(Book book){
        queue.add(book);
    }
    public Book dequeue(){
        return queue.remove(0);
    }
    public  Book peek(){
        return queue.get(0);
    }
    public void display() {
        System.out.println("Queue contents (front to back):");
        for(Book book:queue){
            System.out.println(book);
        }

    }
}
