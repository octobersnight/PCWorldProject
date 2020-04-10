public class RequestInfo {
    private String brand;
    private String size;
    private double budget;
    private String custName;
    private String custAddress;
    private String custContactNum;

    public String getBrand() { return brand; }
    public String getSize() { return size; }
    public double getBudget() { return budget; }

    public void brandName(){
        System.out.println("Enter a brand: ");
    }

    public void sizeCase(){
        System.out.println("Select a size case: ");
        System.out.println("Slim, Mid, Full");
    }

    public void custBudget(){
        System.out.println("Select a budget: ");
        System.out.println();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustContactNum() {
        return custContactNum;
    }

    public void setCustContactNum(String custContactNum) {
        this.custContactNum = custContactNum;
    }
}
