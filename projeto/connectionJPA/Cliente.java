package projeto.connectionJPA;

import java.io.Serializable;
import javax.persistance.Entity;
import javax.persistance.*;

@Entity
@Table
public class Cliente implements Serializable{
    @Id
    private Long id; //Long é um tipo de variável que cria um código/id que pode conter números e caracteres
    
    private String nome;

    private String cpf;

    private String telefone;

    public Integer getID(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCPF(){
        return cpf;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}
