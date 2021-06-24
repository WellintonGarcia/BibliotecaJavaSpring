package br.com.fatecpompeia.bdag2021java2.wellintongarcia.biblioteca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import br.com.fatecpompeia.bdag2021java2.wellintongarcia.biblioteca.repositories.LivroRepository;
import br.com.fatecpompeia.bdag2021java2.wellintongarcia.biblioteca.repositories.GeneroRepository;
import br.com.fatecpompeia.bdag2021java2.wellintongarcia.biblioteca.repositories.AutorRepository;
import br.com.fatecpompeia.bdag2021java2.wellintongarcia.biblioteca.repositories.EditoraRepository;
import br.com.fatecpompeia.bdag2021java2.wellintongarcia.biblioteca.models.Livro;
import java.util.Optional;

@Controller
@RequestMapping("/livros")
public class LivrosController{
    @Autowired
    private LivroRepository livrosRepo;
 
    @Autowired 
    private GeneroRepository generosRepo;

    @Autowired 
    private AutorRepository autoresRepo;

    @Autowired 
    private EditoraRepository editorasRepo;

    @RequestMapping("list")
    public String list (Model model){
        model.addAttribute("livros", livrosRepo.findAll());
        return "list.jsp";
    }

    @RequestMapping("insert")
    public String formInsert(Model model) {
        model.addAttribute("generos", generosRepo.findAll());
        model.addAttribute("autores", autoresRepo.findAll());
        model.addAttribute("editoras", editorasRepo.findAll());
        return "insert.jsp";
    }

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public String saveInsert(
        @RequestParam("titulo") String titulo,
        @RequestParam("genero") int id_genero,
        @RequestParam("autor") int id_autor,
        @RequestParam("editora") int id_editora
        ) {
        Livro livro = new Livro();
        livro.setTitulo(titulo);
        livro.setGenero(generosRepo.findById(id_genero).get());
        livro.setAutor(autoresRepo.findById(id_autor).get());
        livro.setEditora(editorasRepo.findById(id_editora).get());
        livrosRepo.save(livro);
        return "redirect:/livros/list";
    }


    @RequestMapping("update/{id}")
    public String formUpdate(Model model, @PathVariable int id) {
        Optional<Livro> livro = livrosRepo.findById(id);
        if (!livro.isPresent()) return "redirect:/livros/list";
        model.addAttribute("livros", livro.get());
        model.addAttribute("generos", generosRepo.findAll());
        model.addAttribute("autores", autoresRepo.findAll());
        model.addAttribute("editoras", editorasRepo.findAll());
        return "/livros/update.jsp";
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String saveUpdate(
        @RequestParam("titulo") String titulo, 
        @RequestParam("id") int id,
        @RequestParam("genero") int id_genero,
        @RequestParam("autor") int id_autor,
        @RequestParam("editora") int id_editora
        ) {
        Optional<Livro> livro = livrosRepo.findById(id);
        if (!livro.isPresent()) return "redirect:/livros/list";
        livro.get().setTitulo(titulo);
        livro.get().setGenero(generosRepo.findById(id_genero).get());
        livro.get().setAutor(autoresRepo.findById(id_autor).get());
        livro.get().setEditora(editorasRepo.findById(id_editora).get());

        livrosRepo.save(livro.get());
        return "redirect:/livros/list";
    }
     
    @RequestMapping("delete/{id}")
    public String formDelete(Model model, @PathVariable int id) {
        Optional<Livro> livro = livrosRepo.findById(id);
        if (!livro.isPresent()) return "redirect:/livros/list";
        model.addAttribute("livro", livro.get());
        return "/livros/delete.jsp";
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
        public String confirmDelete(@RequestParam("id") int id) {
        livrosRepo.deleteById(id);
        return "redirect:/livros/list";
    }

}