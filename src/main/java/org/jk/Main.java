package org.jk;

import org.jk.Desafio01.*;
import org.jk.Desafio02.EstacaoNoticia;
import org.jk.Desafio02.Noticia;
import org.jk.Desafio02.RadiosLocaisObs;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

import static org.jk.Desafio01.AnimalStatus.*;

public class Main {
    public static void main(String[] args) {
        //desafio01Streams();
        desafio02Observers();

    }

    public static void desafio02Observers(){
        EstacaoNoticia noticia = new EstacaoNoticia(new Noticia("Juscelino", LocalDateTime.now(), "Chuvas fortes destroem o litoral paulista neste feriado de Carnaval! 40 Mortos!") );
        RadiosLocaisObs obs1 = new RadiosLocaisObs("Radio AM Paulista");
        RadiosLocaisObs obs2 = new RadiosLocaisObs("Radio Rock 89 FM");
        RadiosLocaisObs obs3 = new RadiosLocaisObs("FM ALFA");
        RadiosLocaisObs obs4 = new RadiosLocaisObs("Jovem Pan 97,7MHz");

        noticia.register(obs1);
        noticia.register(obs2);
        noticia.register(obs3);
        noticia.register(obs4);

        noticia.notifyTodos();

        noticia.setLocalNews(new Noticia("Ulysses", LocalDateTime.now(), "Atualização do numero de mortos chegam a 46 pessoas dentre elas 5 crianças."));

        noticia.unregister(obs3);

        noticia.notifyTodos();
    }
    public static void desafio01Streams(){
        AnimalList todos = new AnimalList();

        System.out.println("\nVamos verificar como a onça atua no serrado.");
        OncaPintada onca = new OncaPintada( "ONÇA PINTADA", 120, AnimalType.CARNIVORO, AnimalMovementAtack.VERYFAST);
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