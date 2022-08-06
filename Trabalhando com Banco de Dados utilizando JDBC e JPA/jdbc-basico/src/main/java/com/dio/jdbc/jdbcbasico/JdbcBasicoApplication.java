package com.dio.jdbc.jdbcbasico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcBasicoApplication {

    public static void main(String[] args) throws SQLException {
        SpringApplication.run(JdbcBasicoApplication.class, args);

        AlunoDAO alunoDAO = new AlunoDAO();

        // =========================== 1 - Consulta =================================================
        List<Aluno> alunos = alunoDAO.list();

        System.out.println("Consulta");

        alunos.stream().forEach(System.out::println);

        // ======================= 1.1 - Consulta com filtro ========================================
        Aluno alunoParaConsulta = alunoDAO.getById(3);

        System.out.println("Consulta com filtro");

        System.out.println(alunoParaConsulta);

        // =========================== 2 - Inserção =================================================
        System.out.println("Inserção");

        Aluno alunoParaInsercao = new Aluno(
                "Matheus",
                43,
                "SP"
        );

        alunoDAO.create(alunoParaInsercao);

        // =========================== 3 - Delete ===================================================
        System.out.println("Delete");

        alunoDAO.delete(5);
        // =========================== 4 - Atualizar ================================================
        System.out.println("Atualizar");

        Aluno alunoParaAtualizar = alunoDAO.getById(1);
        alunoParaAtualizar.setNome("Joaquim");
        alunoParaAtualizar.setIdade(18);
        alunoParaAtualizar.setEstado("RS");

        alunoDAO.update(alunoParaAtualizar);
    }

}
