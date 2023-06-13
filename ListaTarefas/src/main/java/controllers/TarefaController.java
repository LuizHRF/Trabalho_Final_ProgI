
package controllers;

import entities.Tarefa;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import repositories.TarefaRepository;

/**
 *
 * @author aluno
 */

@RestController
@AllArgsConstructor
public class TarefaController {
    TarefaRepository repository;
    
    @GetMapping("/tarefa")
    public List<Tarefa> getAllTarefas(){
        return repository.findAll();
    }
    
    @GetMapping("/tarefa/{id}")
    public Tarefa getTarefaById(@PathVariable Long id){
        return repository.findById(id).get();
    }
    
    @PostMapping("/tarefa")
    public Tarefa saveTarefa(@RequestBody Tarefa tarefa){
        return repository.save(tarefa);
    }
    
    @DeleteMapping("/tarefaq{id}")
    public void deletetarefa(@PathVariable Long id){
        repository.deleteById(id);
    }
}
