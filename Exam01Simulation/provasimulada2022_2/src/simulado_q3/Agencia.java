package simulado_q3;

import java.util.LinkedList;
import java.util.List;

public class Agencia {
    private String nome;
    private List<Conta> clientes;
    private double totalArmazenado;

    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new LinkedList<Conta>();
        totalArmazenado = 0;
    }

    public void adicionaConta(Conta cliente){
        clientes.add(cliente);
        totalArmazenado += cliente.getSaldo();
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getClientes() {
        return new LinkedList<Conta>(clientes);
    }

    public double getTotalArmazenado() {
        return totalArmazenado;
    }

    @Override
    public String toString() {
        double saldoMedio = totalArmazenado/clientes.size();
        return("Agência: " + nome + ", saldo médio: " + saldoMedio);
    }
    
    
    
}
