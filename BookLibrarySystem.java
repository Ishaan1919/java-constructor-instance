class Book{
    public String ISBN;
    protected String title;
    private String author;

    protected Book(String ISBN, String title){
        this.ISBN = ISBN;
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return this.author;
    }
}

class EBook extends Book{

    public EBook(String ISBN, String title){
        super(ISBN,title);
    }

    public void display(){
        System.out.println("ISBN number of the book is " + ISBN);
        System.out.println("Title of the book is " + title);
    }
}

public class BookLibrarySystem{
    public static void main(String[] args) {
        EBook book = new EBook("1234","Hello Coding World");
        book.setAuthor("Ishaan");
        System.out.println("Author of the book is " + book.getAuthor());
        book.display();

//        Author of the book is Ishaan
//        ISBN number of the book is 1234
//        Title of the book is Hello Coding World
    }
}