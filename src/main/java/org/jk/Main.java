package org.jk;

import org.jk.Desafio01.*;
import org.jk.Desafio02.EstacaoNoticia;
import org.jk.Desafio02.Noticia;
import org.jk.Desafio02.RadiosLocaisObs;
import org.jk.Desafo04.Desafio04Class;

import java.time.LocalDateTime;

public class Main {

    private static final AnimalList todos = new AnimalList();
    public static void main(String[] args) {


        desafio04RsJava();
        // desafio01Streams();
        // desafio02Observers();
    }


    public static void desafio01Streams(){
        Principal desafio01 = new Principal(todos);
        desafio01.generateAnimals();
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

    public static void desafio04RsJava(){
        desafio01Streams();
        Desafio04Class desafio04 = new Desafio04Class(todos);
        System.out.println("Devemos nos manter afastados dos animais...: ");
        desafio04.filtraAtaqueRapido().forEach(x -> System.out.println(x.getNome()));
    }
}