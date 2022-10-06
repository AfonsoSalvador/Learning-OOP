public class BoardGame extends Produto {
    private int idadeMínima;


    public BoardGame(String nome, double preço, int idadeMínima) {
        super(nome, preço);
        this.idadeMínima = idadeMínima;
    }


    public int getIdadeMínima() {
        return idadeMínima;
    }


    public void setIdadeMínima(int idadeMínima) {
        this.idadeMínima = idadeMínima;
    }

    @Override
    public String toString() {
        return "Jogo de Tabuleiro:\n\tNome:"+ getNome()+ "\n\tPreço: R$" + String.format("%.2f", getPreço())+"\n";
    }
    

}
