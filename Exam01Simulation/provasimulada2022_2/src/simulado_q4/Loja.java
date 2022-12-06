package simulado_q4;

import java.util.LinkedList;
import java.util.List;

public class Loja {
    private List<Camisa> estoque;
    private String nome;
    private double caixa;

    public Loja(String nome) {
        this.estoque = new LinkedList<Camisa>();
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
        int index=0;
        for (Camisa c : estoque) {
            System.out.println(index+ " - "+ c);
            index++;
        }
    }

    public Camisa registraEstoque(Tamanho tam, double preço, String cor, int qtd) {
        Camisa nova = new Camisa(tam, preço, cor, qtd);
        estoque.add(nova);
        return nova;
    }

    public Double vendeCamisa(int index, int qtd) {
        if(index>=estoque.size()){
            System.out.println("Posição inválida");
            return null;
        }
        Camisa compra = estoque.get(index);
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
        return "Loja " + nome + "\ncaixa atual: R$" + String.format("%.2f", caixa) + "\n";
    }

}
