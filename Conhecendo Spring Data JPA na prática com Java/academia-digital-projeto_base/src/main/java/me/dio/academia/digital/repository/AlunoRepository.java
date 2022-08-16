package me.dio.academia.digital.repository;

import java.time.LocalDate;
import java.util.List;
import me.dio.academia.digital.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{
    
    
    List<Aluno> findByDataDeNascimento(LocalDate dataDeNascimento); 
}
