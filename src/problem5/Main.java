package problem5;

public class Main {
    public static void main(String[] args){
        System.out.println("===Stack Test===");
        Book book1 = new Book("Clean Code","Robert C.Martin",2008);
        Book book2 = new Book("1984","George Orwell",1949);
        Book book3 = new Book("The Hobbit","J.R.R. Tolkien",1937);
        BookStack stack = new BookStack();
        stack.push(book3);
        stack.push(book2);
        stack.push(book1);
        stack.display();
        System.out.print("Popped:");
        System.out.print(stack.pop());
        System.out.println();
        System.out.print("Top:");
        System.out.print(stack.peek());
        stack.display();
        System.out.println("===Queue Test===");
        BookQueue queue = new BookQueue();
        queue.enqueue(book3);
        queue.enqueue(book2);
        queue.enqueue(book1);
        queue.display();
        System.out.print("Dequeued:");
        System.out.print(queue.dequeue());
        System.out.println();
        System.out.print("Front:");
        System.out.print(queue.peek());
        queue.display();
    }
}
