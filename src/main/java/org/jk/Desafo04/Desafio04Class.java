package org.jk.Desafo04;


import org.jk.Desafio01.AnimalList;
import org.jk.Desafio01.AnimalMovementAtack;

import java.util.stream.Collectors;

public class Desafio04Class {
    /*
        Estamos com um problema de amntermos distância de animais que possuem velocidade de ataque muito rápida,
        pois colocam em risco nossas vidas.
        Então devemos instanciar as classes de animais e filtrar as que possuem esse nível de ataque.
     */
    AnimalList todos;
    public Desafio04Class(AnimalList todos){
        this.todos = todos;
    }
    public AnimalList filtraAtaqueRapido(){
        return (AnimalList) todos.stream()
                .filter(x -> x.getVelocidadeAtaque() == AnimalMovementAtack.VERYFAST).collect(Collectors.toList());
    }
}
