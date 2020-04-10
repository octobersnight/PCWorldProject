import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name:");

        new Greet(input.next());
        System.out.println("Are you searching for PC or Laptop?");

        Budget budget = new Budget();

        switch (input.next().toLowerCase()){
            case "pc":
                System.out.println("Price Range:");
                budget.priceRange();
                budget.typeOfCases(input.nextDouble());
                break;
            case "laptop":
                System.out.println("Size:");
                budget.laptopSizepick();
                budget.laptopSize(input.nextInt());
                break;
            default:
                System.out.println("Incorrect input. Please try again.");
                System.exit(1);
                break;
        }

        System.out.println("We will begin your process, simply answer a few questions." +
                "\nWe will need your information...");
        RequestInfo custInfo = new RequestInfo();

        System.out.println("First and Last Name:");
        custInfo.setCustName(input.next());

        System.out.println("Address:");
        custInfo.setCustAddress(input.next());

        System.out.println("Contact Number:");
        custInfo.setCustContactNum(input.next());

        System.out.println(String.format("Name: %s", custInfo.getCustName()));
        System.out.println(String.format("Address: %s", custInfo.getCustAddress()));
        System.out.println(String.format("Contact: %s", custInfo.getCustContactNum()));
    }
}
