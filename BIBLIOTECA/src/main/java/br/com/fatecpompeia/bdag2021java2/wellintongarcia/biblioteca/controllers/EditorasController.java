package br.com.fatecpompeia.bdag2021java2.wellintongarcia.biblioteca.controllers;

import br.com.fatecpompeia.bdag2021java2.wellintongarcia.biblioteca.models.Editora;
import br.com.fatecpompeia.bdag2021java2.wellintongarcia.biblioteca.repositories.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.Optional;

@Controller
@RequestMapping("/editoras")
public class EditorasController {

  @Autowired
  private EditoraRepository editorasRepo;

  @RequestMapping("list")
  public String list(Model model) {
    model.addAttribute("editoras", editorasRepo.findAll());
    return "list.jsp";
  }

  @RequestMapping("insert")
  public String formInsert() {
    return "insert.jsp";
  }

  @RequestMapping(value = "insert", method = RequestMethod.POST)
  public String saveInsert(
    @RequestParam("nome") String nome,
    @RequestParam("ano") int ano,
    @RequestParam("cidade") String cidade
    ) {
    Editora editora = new Editora();
    editora.setNome(nome);
    editora.setAno(ano);
    editora.setCidade(cidade);
    editorasRepo.save(editora);
    return "redirect:/editoras/list";
  }

  @RequestMapping("update/{id}")
  public String formUpdate(Model model, @PathVariable int id) {
    Optional<Editora> editora = editorasRepo.findById(id);
    if (!editora.isPresent()) return "redirect:/editoras/list";
    model.addAttribute("editoras", editora.get());
    return "/editoras/update.jsp";
  }

  @RequestMapping(value = "update", method = RequestMethod.POST)
  public String saveUpdate(
    @RequestParam("nome") String nome, 
    @RequestParam("id") int id,
    @RequestParam("ano") int ano,
    @RequestParam("cidade") String cidade
    ) {
    Optional<Editora> editora = editorasRepo.findById(id);
    if (!editora.isPresent()) return "redirect:/editoras/list";
    editora.get().setNome(nome);
    editora.get().setAno(ano);
    editora.get().setCidade(cidade);
    editorasRepo.save(editora.get());
    return "redirect:/editoras/list";
  }

  @RequestMapping("delete/{id}")
  public String formDelete(Model model, @PathVariable int id) {
    Optional<Editora> editora = editorasRepo.findById(id);
    if (!editora.isPresent()) return "redirect:/editoras/list";
    model.addAttribute("editoras", editora.get());
    return "/editoras/delete.jsp";
  }

  @RequestMapping(value = "delete", method = RequestMethod.POST)
  public String confirmDelete(@RequestParam("id") int id) {
    editorasRepo.deleteById(id);
    return "redirect:/editoras/list";
  }
}
