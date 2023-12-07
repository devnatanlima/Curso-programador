package src;

import src.model.ContaBancaria;
import src.model.ContaCorrente;
import src.model.Movimentacao;
import src.utils.DataUtil;
import src.model.ContaPoupanca;

public class App {
    
    public static void main(String[] args) {
        System.out.println("Criando nosso Banco Digital");
    System.out.println();

    ContaCorrente conta = new ContaCorrente("0001", "7542", 5, 100.0);
    System.out.println("Saldo atual é de R$" + conta.getSaldo());
    System.out.println();
   
conta.depositar(250.0);
System.out.println("Saldo atual é de R$" + conta.getSaldo());
    System.out.println();

    double saque = conta.sacar(150.0);
System.out.println("Saldo atual é de R$" + conta.getSaldo());
    System.out.println();

ContaPoupanca conta2 = new ContaPoupanca("0001", "5348", 6, 200.0);
conta2.transferir(100.0, conta);
System.out.println("Saldo conta destino de R$" + conta2.getSaldo());
System.out.println();

System.out.println("Saldo atual é de R$" + conta.getSaldo());
System.out.println();

System.out.println(conta2.getDataAbertura());

String formatador = DataUtil.converterDateParaDataEHora(conta2.getDataAbertura());
String formatador2 = DataUtil.converterDateParaData(conta2.getDataAbertura());
String formatador3 = DataUtil.converterDateParaHora(conta2.getDataAbertura());

System.out.println(formatador);
System.out.println(formatador2);
System.out.println(formatador3);
 
//conta corrente
conta.imprimirExtrato();

System.out.println();
System.out.println();

//conta poupança
conta2.imprimirExtrato();


    }

}




