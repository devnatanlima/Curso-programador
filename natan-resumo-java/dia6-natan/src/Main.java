package src;


public class Main {
  public static void main(String[] args) {
    
Car car = new Car("monza", "hibridy", 2023, 125_000);

car.setAno(1990);
car.setMarca("gol");
car.setModelo("g5");
System.out.println(car.getMarca());
System.out.println(car.getModelo());
System.out.println(car.getAno());
System.out.println("Valor de venda: " + car.valorVenda());




  }

}
