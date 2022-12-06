package simulado_q4;

import java.util.LinkedList;
import java.util.List;

public class Loja {
    private List<Camisa> estoque;
    private String nome;
    private double caixa;

    public Loja(List<Camisa> estoque, String nome) {
        this.estoque = estoque;
        this.nome = nome;
        caixa = 0;
    }

    public List<Camisa> getEstoque() {
        return new LinkedList<Camisa>(estoque);
    }

    public String getNome() {
        return nome;
    }

    public double getCaixa() {
        return caixa;
    }

    public void addCaixa(double valor) {
        caixa += valor;
    }

    public void listaEstoque() {
        for (Camisa c : estoque) {
            System.out.println(c);
        }
    }

    public Camisa registraEstoque(Tamanho tam, double preço, String cor, int qtd) {
        Camisa nova = new Camisa(tam, preço, cor, qtd);
        estoque.add(nova);
        return nova;
    }

    public Double vendeCamisa(int index, int qtd) {
        Camisa compra = estoque.get(index);
        if (compra == null) {
            System.out.println("endereço inválido");
            return null;
        }
        Double valor;
        valor = compra.vendeCamisa(qtd);
        if (compra.getQuantidade() == 0) {
            estoque.remove(compra);
        }
        addCaixa(valor);
        return valor;
    }

    @Override
    public String toString() {
        return "Loja " + nome + "\ncaixa atual: R$" + String.format("%.2d", caixa) + "\n";
    }

}
