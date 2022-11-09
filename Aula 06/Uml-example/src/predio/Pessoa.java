package predio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private String nome;
    private int cpf;
    private LocalDate nascimento;
    
    public Pessoa(String nome, int cpf, String Nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dia = LocalDate.parse(Nascimento, formatador);
        dia.format(formatador);
        this.nascimento=dia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "\n\tNome :"+ this.getNome() + "\n\tCPF : "+ this.getCpf()+ "\n\tNascimento : "+ this.getNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    
}
