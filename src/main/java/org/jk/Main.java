package org.jk;

import java.util.stream.Collectors;

import static org.jk.AnimalStatus.*;

public class Main {
    public static void main(String[] args) {

        AnimalList todos = new AnimalList();

        System.out.println("\nVamos verificar como a onça atua no serrado.");
        OncaPintada onca = new OncaPintada( "ONÇA PINTADA", 120,AnimalType.CARNIVORO,AnimalMovementAtack.VERYFAST);
        todos.add(onca);
        System.out.println(onca.getStatusAtual());

        System.out.println("\nVamos adicionar a Galinha ao ambiente do Serrado e verificar o comportamento.");
        Galinha galinha = new Galinha("GALINHA", 2,AnimalType.ONIVORO,AnimalMovementAtack.NOATACK);
        todos.add(galinha);
        System.out.println(galinha.getStatusAtual());

        System.out.println("\nVamos adicionar a VACA ao ambiente do Serrado e verificar o comportamento.");
        Vaca vaca = new Vaca("VACA", 2,AnimalType.HERBIVORO,AnimalMovementAtack.NOATACK);
        todos.add(vaca);
        System.out.println(vaca.getStatusAtual());



        System.out.println("\n\nLista todos os animais criados....");
        todos.toAnimalsString();

        System.out.println("\n\nLista somente os animais que estão ANDANDO!");
        System.out.println(todos.stream().filter(p -> p.getStatusAtual().contains(ANDANDO)).collect(Collectors.toList()));

        System.out.println("\nLista somente os animais que estão COMENDO!");
        System.out.println(todos.stream().filter(p -> p.getStatusAtual().contains(COMENDO)).collect(Collectors.toList()));

        System.out.println("\nLista todos os animais com ataque muito rápido!");
        System.out.println(todos.stream().filter(p -> p.getVelocidadeAtaque().equals(AnimalMovementAtack.VERYFAST)).collect(Collectors.toList()));


    }
}