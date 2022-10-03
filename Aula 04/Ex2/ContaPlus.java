public class ContaPlus extends Conta{
    

    
    public ContaPlus(String nomeCliente, double saldo) {
        super(nomeCliente, saldo);
    }

    @Override
    public double sacaValor(double valor) {
        double taxa=valor*0.01;
        super.setSaldo(super.getSaldo()-(valor+taxa));
        return taxa;
    }

    @Override
    public String toString() {
        return "Super " + super.toString();
    }
}
