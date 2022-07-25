
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author silas
 */
public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JS");
        curso1.setDescription("ES6");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java");
        curso2.setDescription("POO");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescription("POO");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devSilas = new Dev();
        devSilas.setNome("Silas");
        devSilas.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devSilas.getConteudosInscritos());
        devSilas.progredir();
        devSilas.progredir();
        System.out.println("Conteudos Inscritos" + devSilas.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devSilas.getConteudosConcluidos());
        System.out.println("XP:" + devSilas.calcularTotalXp());

        Dev devGato = new Dev();
        devGato.setNome("Gato");
        devGato.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devGato.getConteudosInscritos());
        devGato.progredir();
        System.out.println("Conteudos Inscritos" + devGato.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devGato.getConteudosConcluidos());
        System.out.println("XP:" + devGato.calcularTotalXp());

    }
}
