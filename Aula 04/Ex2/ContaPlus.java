public class ContaPlus extends Conta{
    

    
    public ContaPlus(String nomeCliente, double saldo) {
        super(nomeCliente, saldo);
    }

    @Override
    public void sacaValor(double valor) {
        super.setSaldo(super.getSaldo()-(valor+(valor*0.01)));
    }

    @Override
    public String toString() {
        return "Super" + super.toString();
    }
}
