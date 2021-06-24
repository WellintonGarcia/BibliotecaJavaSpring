package br.com.fatecpompeia.bdag2021java2.wellintongarcia.biblioteca.repositories;

import br.com.fatecpompeia.bdag2021java2.wellintongarcia.biblioteca.models.Livro;
import org.springframework.data.repository.CrudRepository;

public interface LivroRepository extends CrudRepository<Livro, Integer>{}
