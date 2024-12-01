//Create a main function in different class( says XYZ)and perform tasks
import java.util.Scanner;

public class XYZ {

   public  void totalAmount(Product[] products )
    {
double total=0;

        for (int i = 0; i < 5; i++) {
         total=total+products[i].price*products[i].quantity;


        }
        System.out.println("Total amount spent on all products total is "+total);
    }


    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();
        // Create an array of 5 Product objects
        Product[] products = new Product[5];
        int pid;
        double price;
        int quantity;


        // Accept product information from the user
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            System.out.print("Enter Product ID: ");
            pid = scanner.nextInt();

            System.out.print("Enter Product Price: ");
            price = scanner.nextDouble();

            System.out.print("Enter Product Quantity: ");
            quantity = scanner.nextInt();

            // Create a new Product object and store it in the array
            products[i] = new Product(pid, price, quantity);
                }
                 // Method to calculate the total price of all products
                 product.highestPriceProduct(products);
                XYZ xyz=new XYZ();
                 xyz.totalAmount(products);

    }
}