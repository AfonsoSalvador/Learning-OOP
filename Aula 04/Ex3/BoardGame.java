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

    

}
