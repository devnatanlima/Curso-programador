import java.util.ArrayList;

import src.model.Camareira;
import src.model.Cliente;
import src.model.EnumTipo;
import src.model.Gerente;
import src.model.Quarto;
import src.model.Recepcionista;

public class App {
    public static void main(String[] args) {
        System.out.println("Hotel Transilvânia");
        System.out.println();

        
//#region
        Recepcionista recepcionista1 = new Recepcionista("Valeria", "7577585959588", "857584894856");

        recepcionista1.atenderOTelefone();
        recepcionista1.falarIngles();

        Camareira camareira1 = new Camareira("Joana", "854847740839", "88587583900");

        camareira1.arrumarACama();
        camareira1.limparQuarto();

        //deu dor de barriga na valeria

        Gerente gerente1 = new Gerente("Fabricio", "78766757687", "7553344593");

        gerente1.atenderOTelefone();
        gerente1.falarIngles();

        Quarto quarto1 = new Quarto();
        quarto1.setNumero("206A");
        quarto1.setValor(100.0);
        quarto1.setTipo(EnumTipo.BASICO);

        Quarto quarto2 = new Quarto();
        quarto2.setNumero("306A");
        quarto2.setValor(200.0);
        quarto2.setTipo(EnumTipo.PRESIDENCIAL);

        System.out.println(quarto2.getTipo());
        System.out.println(quarto2.getTipo().getValor());
        //#endregion
    
    Cliente cliente1 = new Cliente("Manoel da Silva", "988787877887", "08765678766", 42);
    Cliente cliente2 = new Cliente("Fulano de Tal", "9887878767887", "087656178766", 21);
    Cliente cliente3 = new Cliente("Ciclano Rodrigues", "987878777887", "087652678766", 36);
    Cliente cliente4 = new Cliente("Beltrano Rodrigues", "98878777887", "082765678766", 56);

ArrayList<Cliente> clientes = new ArrayList<Cliente>();

clientes.add(cliente1);
clientes.add(cliente2);
clientes.add(cliente3);
clientes.add(cliente4);

//Retorna a quantidade de elementos presentes em uma stream(coleção), qualquer um dos dois modelos abaixo.
clientes.stream().count();
clientes.size();

//var resultado1 = clientes.stream().limit(2);
//var resultado2 = clientes.stream().skip(2);

clientes.stream().limit(2).forEach(c -> System.out.println(c.getNome()));
clientes.stream().skip(2).forEach(c -> System.out.println(c.getNome()));
// var resultado3 = clientes.stream().sorted();

//var resultado4 = clientes.stream().filter(c -> c.getIdade() > 25);
clientes.stream().filter(c -> c.getIdade() > 25).forEach(c -> System.out.println(c.getNome()));

System.out.println();
System.out.println();
System.out.println();
clientes.stream().filter(c -> c.getNome().contains("Rodrigues")).forEach(c -> System.out.println(c.getNome()));

clientes.stream().filter(c -> c.getNome().startsWith("B")).forEach(c -> System.out.println(c.getNome()));
   
clientes.stream().map(c -> c.getNome());
//clientes.stream().map(Cliente::getNome); faz a mesma coisa do codigo acima.

}
}
