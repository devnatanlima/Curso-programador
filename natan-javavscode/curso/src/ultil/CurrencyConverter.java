package ultil;

public class CurrencyConverter {
    public static double dollar;
    public static double quantityD;
   

    public static double resultado(){
        return (quantityD * dollar * 6/100) + dollar * quantityD;
    }




}
