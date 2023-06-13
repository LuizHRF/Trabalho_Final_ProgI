/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositories;

import entities.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author aluno
 */
public interface TarefaRepository extends JpaRepository<Tarefa, Long>{
    
}
