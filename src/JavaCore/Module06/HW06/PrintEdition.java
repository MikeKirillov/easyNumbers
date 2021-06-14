package JavaCore.Module06.HW06;

public class PrintEdition {
    String name;

    public PrintEdition(String name) {
        this.name = name;
    }
}

class Magazine extends PrintEdition {
    String type;

    public Magazine(String name, String type) {
        super(name);
        this.type = type;
    }
}

class Book extends PrintEdition {
    int quantityOfPages, year;
    String author;
    String[] pages;

    public Book(String name, int quantityOfPages, int year, String author, String[] pages) {
        super(name);
        this.quantityOfPages = quantityOfPages;
        this.year = year;
        this.author = author;

        this.pages = new String[quantityOfPages + 1];
        this.pages[0] = name + ", " + author;
        for (int i = 1; i < this.pages.length; i++) {
            this.pages[i] = pages[i - 1];
        }
    }

    public String getPage(int n) {
        return pages[n];
    }
}

class Schoolbook extends Book {
    String subject;
    int grade;

    public Schoolbook(String name, int quantityOfPages, int year, String author, String[] pages, String subject, int grade) {
        super(name, quantityOfPages, year, author, pages);
        this.subject = subject;
        this.grade = grade;
    }
}

class Fiction extends Book {
    String genre;

    public Fiction(String name, int quantityOfPages, int year, String author, String[] pages, String genre) {
        super(name, quantityOfPages, year, author, pages);
        this.genre = genre;
    }
}