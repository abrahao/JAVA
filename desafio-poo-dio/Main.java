import java.time.LocalDate;

import br.com.dio.desafio.dominio.*;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java |");
        curso1.setDescricao("Curso Java |");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JS |");
        curso2.setDescricao("Curso JS |");
        curso2.setCargaHoraria(4);

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Java |");
        mentoria1.setDescricao("Mentoria Java |");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("JS |");
        mentoria2.setDescricao("Mentoria JS |");
        mentoria2.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao do bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devAbrahao = new Dev();
        devAbrahao.setNome("abrahao");
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");


        // System.out.println(mentoria1);
        // System.out.println(mentoria2);
    }
}