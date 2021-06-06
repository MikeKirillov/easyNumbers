package Module03.HWM3;

public class BookStore {
    public static void main(String[] args) {//task 04 BookStore
        Book[] books = new Book[3];

        Book book1 = new Book();
        book1.name = "Hobbit";
        book1.year = 1914;
        book1.price = 24;
        addBook(books, book1);

        Book book2 = new Book();
        book2.name = "Lord of the rings";
        book2.year = 1917;
        book2.price = 32;
        addBook(books, book2);
        printBooks(books);
    }

    private static boolean checkBook(Book[] books, Book book) {
        for (Book item : books) {
            if (item != null && book.name.equals(item.name) && book.year == item.year) {
                System.out.println("this one is already at the bookstore");
                return true;
            }
        }
//        System.out.println("this book is a new one");
        return false;
    }

    private static void addBook(Book[] books, Book book) {
        if (!checkBook(books, book)) {
            for (int i = 0; i < books.length; i++) {
                if (books[i] == null) {
                    books[i] = book;
//                    System.out.println("book was added");
                    break;
                } else if (i == books.length - 1) {
                    System.out.println("book wasn't added cuz there's no free space");
                }
            }
        }
    }

    private static void printBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
//                System.out.println(String.format("Book number - %d\nName - %s\nYear - %d\nPrice - %d\n", i+1, books[i].name, books[i].year, books[i].price));
                System.out.printf("Book number - %d\nName - %s\nYear - %d\nPrice - %d\n%n", i+1, books[i].name, books[i].year, books[i].price);
            }
        }
    }
}

class Book {
    public String name = "";
    public int price;
    public int year;
}