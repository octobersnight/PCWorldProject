public enum Company {

    ACER, APPLE, ASUS, GIGABYTE, HP, LENOVO, MSI, SAMSUNG;

    public String toString(){
        switch(this){
            case ACER: return "acer";
            case APPLE: return "apple";
            case ASUS: return "asus";
            case GIGABYTE: return "gigabyte";
            case HP: return "hp";
            case LENOVO: return "lenovo";
            case MSI: return "msi";
            case SAMSUNG: return "samsung";
            default: return "";
        }
    }


}
