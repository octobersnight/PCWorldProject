import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name:");
        String userName = input.next();

        new Greet(userName);
        System.out.println("Are you searching for PC or Laptop?");
        String userSelection = input.next().toLowerCase();

        Budget budget = new Budget();

        switch (userSelection){
            case "pc":
                System.out.println("Price Range:");
                budget.priceRange();
                double userChoice = input.nextDouble();
                budget.typeOfCases(userChoice);
                break;
            case "laptop":
                System.out.println("Size:");
                budget.laptopSizepick();
                int userChoice1 = input.nextInt();
                budget.laptopSize(userChoice1);
                break;
            default:
                System.out.println("Incorrect input. Please try again.");
                System.exit(1);
                break;
        }

        System.out.println("We will begin your process, simply answer a few questions." +
                "\nWe will need your information...");
        System.out.println("First and Last Name:");
        String full_name = input.next();
        System.out.println("Address:");
        String address = input.next();
        System.out.println("Contact Number:");
        String contact = input.next();

        RequestInfo custInfo = new RequestInfo();
        custInfo.setCustName(full_name);
        custInfo.setCustAddress(address);
        custInfo.setCustContactNum(contact);

        System.out.println(String.format("Name: %s", custInfo.getCustName()));
        System.out.println(String.format("Address: %s", custInfo.getCustAddress()));
        System.out.println(String.format("Contact: %s", custInfo.getCustContactNum()));

    }
}
