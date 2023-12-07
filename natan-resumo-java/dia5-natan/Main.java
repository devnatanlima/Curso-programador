public class Main {
    public static void main(String[] args) {
       productList("laranja", 12.20);
       productList("banana", 17.50);
    }

    public static void productList(String productName, Double productValue) {
        System.out.println(productName+ " - " + productValue);
    }
}