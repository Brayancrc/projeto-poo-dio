
import br.com.dio.projeto.dominio.Bootcamp;
import br.com.dio.projeto.dominio.Curso;
import br.com.dio.projeto.dominio.Dev;
import br.com.dio.projeto.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

         Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBrayan = new Dev();
        devBrayan.setNome("Brayan");
        devBrayan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Brayan" + devBrayan.getConteudosInscritos());
        devBrayan.progredir();
        devBrayan.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Brayan" + devBrayan.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Brayan" + devBrayan.getConteudosConcluidos());
        System.out.println("XP:" + devBrayan.calcularTotalXp());

        System.out.println("------------");

        Dev devJessica = new Dev();
        devJessica.setNome("Jessica");
        devJessica.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jessica" + devJessica.getConteudosInscritos());
        devJessica.progredir();
        devJessica.progredir();
        devJessica.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jessica" + devJessica.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Jessica" + devJessica.getConteudosConcluidos());
        System.out.println("XP:" + devJessica.calcularTotalXp());



    }
}
