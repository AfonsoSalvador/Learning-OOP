package simulado_q2;

import java.util.Random;

public class Pokemon implements PersonagemDeLuta<Pokemon> {
    private int vitalidade;
    private int vitalidadeAtual;
    private int ataque1;
    private int ataque2;

    

    public Pokemon(int vitalidade, int ataque1, int ataque2) {
        this.vitalidade = vitalidade;
        vitalidadeAtual = vitalidade;
        this.ataque1 = ataque1;
        this.ataque2 = ataque2;
    }

    @Override
    public void regenera() {
        vitalidadeAtual = vitalidade;
    }

    @Override
    public boolean atacar(Pokemon personagemAtacado) {
        Random r = new Random();
        int ataque;
        if(r.nextBoolean()==true){
            ataque = ataque1;
        }
        else{
            ataque = ataque2;
        }
        if(personagemAtacado.getPontosVitalidade()<ataque){
            personagemAtacado.setVitalidadeAtual(0);
            return true;
        }
        else{
            personagemAtacado.setVitalidadeAtual(personagemAtacado.getPontosVitalidade()-ataque);
            return false;
        }
    }

    public int getPontosVitalidade() {
        return vitalidadeAtual;
    }

    public void setVitalidadeAtual(int vitalidadeAtual) {
        this.vitalidadeAtual = vitalidadeAtual;
    }




}


