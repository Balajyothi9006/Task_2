//Create a class Product(pid,price ,quantity) with parameterized constructor
public class Product {
    public Product()
    {}
    public int pid;
    public double price;
    public int quantity;


    // Parameterized constructor
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }


    //Method to display pid of the product with highest price
        public void highestPriceProduct(Product[] products) {
        double max=0;
        int id=0;
        for (int i = 0; i < 5; i++)
        {
        if(products[i].price>max)
        {
            max=products[i].price;
            id=products[i].pid;
        }
        }
        System.out.println("The pid " + id+" is with highest price "+max);
    }
    // Method to calculate total value of the product

}






