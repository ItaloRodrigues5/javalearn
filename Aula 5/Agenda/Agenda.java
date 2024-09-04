import java.util.ArrayList;

public class Agenda {
    private String nome;
    private String numero;

    public Agenda(String nome, String numero){
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome(){
        return nome;
    }

    public String getNumero(){
        return numero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public String toString(){
        return "Nome: " + nome + "\nNumero: " + numero;
    }
}
