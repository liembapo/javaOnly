package classAndObject.constructor;

public class Books {
    String name;
    String author;
    int pages;


    public Books() {
    }

    public Books(String name, String author, int pages) {
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    public void info() {
        System.out.println("Name " + name);
        System.out.println("Author " + this.author);
        System.out.println("Pages " + this.pages);
        System.out.println();
    }

}

