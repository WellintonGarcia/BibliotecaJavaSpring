package br.com.fatecpompeia.bdag2021java2.wellintongarcia.biblioteca.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "autores")

public class Autor {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private int id;
    private String nome;

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
    
}
