import java.util.Enumeration;

class BookDetail{
    protected String title;
    protected String author;
    protected int price;
    protected int availability;

    protected BookDetail(String title, String author, int price, int availability){
        this.author = author;
        this.availability = availability;
        this.price = price;
        this.title = title;
    }

    protected BookDetail(){
        this.author = "";
        this.title = "";
        this.price = 0;
        this.availability = 0;
    }

    void borrowBook(int numberOfBooks){
        if(numberOfBooks>availability){
            System.out.println(numberOfBooks + " books are not available");
            return;
        }
        else{
            availability-=numberOfBooks;
        }
    }
    void display(){
        System.out.println("Author of the book is " + this.author);
        System.out.println("Title of the book is " + this.title);
        System.out.println("Price of the book is " + this.price);
        System.out.println(this.availability + " books are available");
    }
}

class LibraryBookSystem{
    public static void main(String[] args) {
        BookDetail book1 = new BookDetail();
        book1.display();

        BookDetail book2 = new BookDetail("Start Coding" ,"Ishaan", 1000, 10);
        book2.display();

//        Author of the book is
//        Title of the book is
//        Price of the book is 0
//        0 books are available
//
//        Author of the book is Ishaan
//        Title of the book is Start Coding
//        Price of the book is 1000
//        10 books are available
    }
}