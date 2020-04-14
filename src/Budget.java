public class Budget {
    public void typeOfCases(double priceRange){
        if (priceRange <= 300) {
            System.out.println("Slim would be perfect for you.");
        } else if (priceRange >= 301 && priceRange < 600) {
            System.out.println("We recommend a Laptop or mid-tower.");
        } else if(priceRange >= 600 && priceRange < 1000) {
            System.out.println("Are you looking for a workstation?");
        } else if(priceRange >= 1000) {
            System.out.println("A powerful full-tower or a gamer Laptop.");
        } else {
            System.out.println("There is no value.");
        }
    }

    public void laptopSize(int custSize){
        if (custSize == 11 || custSize == 12) {
            System.out.println("Great! go for a tablet.");
        } else if (custSize == 13 || custSize == 14) {
            System.out.println("Its a standard size for school and travel.");
        } else if(custSize == 15 || custSize == 16) {
            System.out.println("Are you looking for a workstation?");
        } else if(custSize == 17 || custSize == 18) {
            System.out.println("Too big, do you need glasses? ");
        } else {
            System.out.println("There is no value.");
        }
    }

    public void priceRange(){
        System.out.println("300 or less");
        System.out.println("More than 300 but less than 600");
        System.out.println("More than 600 but less than 1000");
        System.out.println("More than 1000");
    }

    public void laptopSizepick(){
        System.out.println("11 to 12 inches");
        System.out.println("13 to 14 inches");
        System.out.println("15 to 16 inches");
        System.out.println("17 to 18 inches");
    }
}
