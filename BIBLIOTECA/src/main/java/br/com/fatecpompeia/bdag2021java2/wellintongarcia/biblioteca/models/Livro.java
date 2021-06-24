package br.com.fatecpompeia.bdag2021java2.wellintongarcia.biblioteca.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "livros")

public class Livro {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private int id;
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "id_genero")

    private Genero genero;

    @ManyToOne
    @JoinColumn(name = "id_autor")

    private Autor autor;

    @ManyToOne
    @JoinColumn(name = "id_editora")

    private Editora editora;

    public int getId () {

        return this.id;

    }

    public void setId (int id) {

        this.id = id;

    }

    public String getTitulo () {

        return this.titulo;

    }

    public void setTitulo (String titulo) {

        this.titulo = titulo;

    }

    public Genero getGenero () {

        return this.genero;

    }

    public void setGenero (Genero genero) {

        this.genero = genero;

    }

    public Autor getAutor () {

        return this.autor;

    }

    public void setAutor (Autor autor) {

        this.autor = autor;

    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    
}
