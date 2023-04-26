public class ContaBancaria {

    // atributos privados
    private String titular;
    private int numeroConta;
    private double saldo;
    
    // métodos getters e setters
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // métodos 
    public void sacar(double valor) {
        if (saldo >= valor) {
            this.saldo -= valor;
        } else{
            System.out.println("saldo insuficiente");
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void transferir(String titular, double valor) {
        if (saldo >= valor) {
            this.saldo -= valor;
        } else{
            System.out.println("saldo insuficiente");
        }
    }

}
