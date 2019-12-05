package studentMentoring;

public class Book {
    String name;
    String author;
    int pages;


    public Book() {
    }

    public Book(String name, String author, int pages) {  // constructor
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    public void info() {                            // method
        System.out.println("Name " + name);
        System.out.println("Author " + this.author);
        System.out.println("Pages " + this.pages);
        System.out.println();
    }

}

