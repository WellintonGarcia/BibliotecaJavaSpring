package br.com.fatecpompeia.bdag2021java2.wellintongarcia.biblioteca.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "editoras")

public class Editora {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private int id;
    private String nome;
    private int ano;
    private String cidade;

    public int getId () {

        return this.id;

    }

    public void setId (int id) {

        this.id = id;

    }

    public String getNome () {

        return this.nome;

    }

    public void setNome (String nome) {

        this.nome = nome;

    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    
}
