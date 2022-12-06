package simulado_q4;

import java.time.LocalDate;

public class Camisa {
    private Tamanho tamanho;
    private double preço_base;
    private String cor;
    private LocalDate inserção_no_sistema;
    private int quantidade;
    private double desconto;

    public Camisa(Tamanho tamanho, double preço, String cor, int quantidade) {
        this.tamanho = tamanho;

        if (tamanho.equals(Tamanho.PEQUENO)) {
            this.preço_base = preço * 0.9;
        } else if (tamanho.equals(Tamanho.MEDIO)) {
            this.preço_base = preço;
        } else if (tamanho.equals(Tamanho.GRANDE)) {
            this.preço_base = preço * 1.25;
        }
        this.cor = cor;
        this.inserção_no_sistema = LocalDate.now();
        this.quantidade = quantidade;
        this.desconto = 1.0;
    }

    public double getDesconto() {
        return desconto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public double getPreço() {
        return preço_base * desconto;
    }

    public double getPreço_base() {
        return preço_base;
    }

    public String getCor() {
        return cor;
    }

    public Double vendeCamisa(int quantidade) {
        if (quantidade > this.quantidade) {
            System.out.println("Não temos essa quantidade!");
            return null;
        }
        this.quantidade -= quantidade;
        return quantidade * (preço_base * desconto);
    }

    public LocalDate getInserção_no_sistema() {
        return inserção_no_sistema;
    }

    @Override
    public String toString() {
        return "\tCamisa " + cor + "\n\tQuatidade:" + quantidade + "\n\tPreço: R$" + String.format("%.2d", preço_base)
                + " (" + ((desconto * 100) - 100) + "% de desconto\n";
    }
}
