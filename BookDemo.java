import java.util.Scanner;

class Book {
    String name;
    String author;
    double price;
    int num_pages;

    public Book(String name, String author, double price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }

    public String toString() {
        String name, author, price, num_pages;
        name = "Book name:" + this.name + "\n";
        author = "Author name:" + this.author + "\n";
        price = "Price:" + this.price + "\n";
        num_pages = "Number of Pages:" + this.num_pages + "\n";
        return name + author + price + num_pages;

    }
}

public class BookDemo {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of books:");
        int n = s.nextInt();
        s.nextLine();
        Book b[] = new Book[n];

        // Input loop
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1) + ":");
            System.out.print("Enter book name: ");
            String name = s.nextLine();

            System.out.print("Enter author name: ");
            String author = s.nextLine();

            System.out.print("Enter price: ");
            int price = s.nextInt();

            System.out.print("Enter number of pages: ");
            int numPages = s.nextInt();
            s.nextLine();

            b[i] = new Book(name, author, price, numPages);
        }
        System.out.println("\nBOOK DETAILS");
        for (int i = 0; i < n; i++) {
            System.out.println("Book " + (i + 1) + " Details:");
            System.out.println(b[i].toString());
        }

        s.close();
    }

}
