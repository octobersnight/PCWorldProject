public class Computer {
    protected Company brand;
    protected double price;

    // default constructor
    public Computer() {}

    // Basic Constructor
    public Computer(Company brand, double price){
        this.brand = brand;
        this.price = price;
    }

    public Company getBrand() {
        return brand;
    }

    public void setBrand(Company brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
