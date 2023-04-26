public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria emanuel = new ContaBancaria();

        emanuel.setTitular("Emanuel");
        emanuel.setSaldo(5000);
        emanuel.setNumeroConta(12345678);
       
        ContaBancaria joao = new ContaBancaria();
        joao.setTitular("João");
        joao.setSaldo(2000);
        joao.setNumeroConta(98765432);

        System.out.println("Saldos ");
        System.out.println("Saldo de Emanuel R$" + emanuel.getSaldo());
        System.out.println("Saldo da João R$" + joao.getSaldo());
      
        emanuel.depositar(120);
        emanuel.sacar(500);
       emanuel.transferir("João", 1980); joao.depositar(1980);
   
        joao.depositar(500);
        joao.sacar(20);
        joao.transferir("Emanuel", 800); emanuel.depositar(800);

        System.out.println("\nSaldos ");
        System.out.println("Saldo do Emanuel R$" + emanuel.getSaldo());
        System.out.println("Saldo da João R$" + joao.getSaldo());
    }
}
