class Book{
    private String title;
    private String author;
    private int price;

    protected Book(){
        this.price = 0;
        this.title = "";
        this.author = "";
    }

    protected Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    protected void display(){
        System.out.println("Title of the book is " + title);
        System.out.println("Author of the book is " + author);
        System.out.println("Price of the book is " + price);
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.display();

        Book book2 = new Book("Football", "Ishaan", 1000);
        book2.display();

//        Title of the book is
//        Author of the book is
//        Price of the book is 0
//        Title of the book is Football
//        Author of the book is Ishaan
//        Price of the book is 1000
    }
}