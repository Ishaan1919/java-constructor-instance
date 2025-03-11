class Product{
    private String productName;
    private int price;
    static int totalProducts;

    protected Product(String productName, int price){
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    protected void displayProductDetails(){
        System.out.println("Product Name is " + productName);
        System.out.println("Product Price is " + price);
    }
    static void displayTotalProducts(){
        System.out.println("Number of products are " + totalProducts);
    }
}

public class ProductInventory{
    public static void main(String[] args) {
        Product product1 = new Product("Football", 800);
        product1.displayProductDetails();

        Product product2 = new Product("Chess", 1000);
        product2.displayProductDetails();

        Product.displayTotalProducts();

//        Product Name is Football
//        Product Price is 800
//        Product Name is Chess
//        Product Price is 1000
//        Number of products are 2
    }
}


//Create a Product class with:
//Instance Variables: productName, price.
//Class Variable: totalProducts (shared among all products).
//Methods:
//An instance method displayProductDetails() to display the details of a product.
//A class method displayTotalProducts() to show the total number of products created.