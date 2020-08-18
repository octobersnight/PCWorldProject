// Personal Computer
public class PC extends Computer{
    private String caseSize;

    public PC(){}

    public PC(String caseSize, Company brand, double price){
        // invoking base-class(Computer) constructor
        super(brand, price);
        this.caseSize = caseSize;
        this.brand = brand;
        this.price = price;
    }
}
