package br.com.fatecpompeia.bdag2021java2.wellintongarcia.biblioteca.controllers;

import br.com.fatecpompeia.bdag2021java2.wellintongarcia.biblioteca.repositories.AutorRepository;
import br.com.fatecpompeia.bdag2021java2.wellintongarcia.biblioteca.models.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.Optional;

@Controller
@RequestMapping("/autores")
public class AutoresController {

  @Autowired
  private AutorRepository autoresRepo;

  @RequestMapping("list")
  public String list(Model model) {
    model.addAttribute("autores", autoresRepo.findAll());
    return "list.jsp";
  }

  @RequestMapping("insert")
  public String formInsert() {
    return "insert.jsp";
  }

  @RequestMapping(value = "insert", method = RequestMethod.POST)
  public String saveInsert(@RequestParam("nome") String nome) {
    Autor autor = new Autor();
    autor.setNome(nome);
    autoresRepo.save(autor);
    return "redirect:/autores/list";
  }

  @RequestMapping("update/{id}")
  public String formUpdate(Model model, @PathVariable int id) {
    Optional<Autor> autor = autoresRepo.findById(id);
    if (!autor.isPresent()) return "redirect:/autores/list";
    model.addAttribute("autor", autor.get());
    return "/autores/update.jsp";
  }

  @RequestMapping(value = "update", method = RequestMethod.POST)
  public String saveUpdate(@RequestParam("nome") String nome, @RequestParam("id") int id) {
    Optional<Autor> autor = autoresRepo.findById(id);
    if (!autor.isPresent()) return "redirect:/autores/list";
    autor.get().setNome(nome);
    autoresRepo.save(autor.get());
    return "redirect:/autores/list";
  }

  @RequestMapping("delete/{id}")
    public String formDelete(Model model, @PathVariable int id) {
        Optional<Autor> autor = autoresRepo.findById(id);
        if (!autor.isPresent()) return "redirect:/autores/list";
        model.addAttribute("autores", autor.get());
        return "/autores/delete.jsp";
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
      public String confirmDelete(@RequestParam("id") int id) {
        autoresRepo.deleteById(id);
        return "redirect:/autores/list";
      }
}
