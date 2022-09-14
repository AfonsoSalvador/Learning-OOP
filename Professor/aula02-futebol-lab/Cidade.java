
public class Cidade {
    private String nome;
    private UnidadeDaFederacao uf;

    public Cidade(String nome, UnidadeDaFederacao uf) {
        this.nome = nome;
        this.uf = uf;
    }

    public UnidadeDaFederacao getUf() {
        return uf;
    }

    public void setUf(UnidadeDaFederacao uf) {
        this.uf = uf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
