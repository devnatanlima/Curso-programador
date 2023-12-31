package entities;

public class Employee {
    public String name;
    public double salarioBruto;
    public double imposto;
    

    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public void aumentoSalario(double percentage){
        salarioBruto += salarioBruto * percentage / 100.0;
    }

    public String toString(){
        return String.format(" %s, $ %.2f", name, salarioLiquido());
    }

}
