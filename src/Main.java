import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Orientacao a Objetos");
        curso1.setDescricao("Programacao orientada a objetos");
        curso1.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Live sobre Objetos");
        mentoria1.setDescricao("Primeira mentoria do curso");
        mentoria1.setData(LocalDate.of(2023, 3, 25));

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Bootcamp da DIO");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev devVilson = new Dev();
        devVilson.setNome("Vilson");
        devVilson.inscreverBootcamp(bootcamp);
        System.out.println("Inscrições de Vilson" + devVilson.getConteudosInscritos());
        devVilson.progredir();
        System.out.println("Inscrições após progredir" + devVilson.getConteudosInscritos());
        System.out.println("Conlusões de Vilson" + devVilson.getConteudosConcluidos());
        System.out.println("XP de Vilson" + devVilson.calcularTotalXP());

        System.out.println("-------");

        Dev devLinda = new Dev();
        devLinda.setNome("Linda");
        devLinda.inscreverBootcamp(bootcamp);
        System.out.println("Inscrições de Linda" + devLinda.getConteudosInscritos());
        devLinda.progredir();
        System.out.println("Inscrições apos progredir" + devLinda.getConteudosInscritos());
        System.out.println("Conlusões de Linda" + devLinda.getConteudosConcluidos());
        System.out.println("XP de Linda" + devLinda.calcularTotalXP());



    }//main
}//MAIN