public class Conta {
    private String nomeCliente;
    private double saldo;


    
    public Conta(String nomeCliente, double saldo) {
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double valor){
        saldo=valor;
    }
    
    public void depositaValor(double valor){
        saldo+=valor;
    }

    public void sacaValor(double valor){
        saldo-=(valor+(valor*0.05));
    }

    @Override
    public String toString() {
        return "Cliente\t\nNome:"+nomeCliente+"\n\tSaldo: R$"+ String.format("%.2f",getSaldo())+ "\n";
    }
    
    
}