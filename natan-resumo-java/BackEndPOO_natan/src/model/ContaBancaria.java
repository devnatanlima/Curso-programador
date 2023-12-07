package src.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;

public abstract class ContaBancaria { 
    //#region Atributos
    protected String agencia;
    protected String conta;
    protected Integer digito;
    protected Double saldo;
    protected Double VALOR_MINIMO_DEPOSITO = 10.0;
    protected Date dataAbertura;
    protected ArrayList<Movimentacao> movimentacoes;
//#endregion Atributos

   

    //#region Construtores
    public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
        this.dataAbertura = new Date();
// se nao instaciar, vai dar uma exception de nullpointerException
        this.movimentacoes = new ArrayList<Movimentacao>();
//criando a primeira movimentacao.
        Movimentacao movimentacao = new Movimentacao("Abertura de conta", saldoInicial);
        
        //aqui estou salvando a movimentacao dentro do meu array de movimentacoes.
        //aqui estou iniciando o meu extrato bancario.
        this.movimentacoes.add(movimentacao);
    
    }
    //#endregion Contrutores

    //#region Gettters e Setters

     public Date getDataAbertura() {
        return dataAbertura;
    }


    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }
    public Integer getDigito() {
        return digito;
    }
    public void setDigito(Integer digito) {
        this.digito = digito;
    }
    public Double getSaldo() {
        return saldo;
    }
    //#endregion Getters e Setters

    //#region Metodos

    public void depositar(Double valor){
            if(valor < VALOR_MINIMO_DEPOSITO){
                throw new InputMismatchException("O valor mínimo de deposito é R$" + VALOR_MINIMO_DEPOSITO);
            }
/*his.saldo = this.saldo + valor;*/
        this.saldo += valor;

        Movimentacao movimentacao = new Movimentacao("Deposito", valor);
        this.movimentacoes.add(movimentacao);
    }

    public Double sacar(Double valor){
        
        if(valor > this.saldo){
            throw new InputMismatchException("O saldo é insuficiente");
        }

        /*this.saldo = this.saldo - valor;*/
        this.saldo -= valor;

        Movimentacao movimentacao = new Movimentacao("Retirada de valor", valor);
        this.movimentacoes.add(movimentacao);

        return valor;

    }
    public void transferir(Double valor, ContaBancaria contaDestino){
    //efetua o saque na conta atual.
        this.sacar(valor);
//efetua o deposito na conta de destino.
    contaDestino.depositar(valor);
    }
    //#endregion Metodos

   public abstract void imprimirExtrato();
    }
    

