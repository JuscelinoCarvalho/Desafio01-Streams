package org.jk;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Animal {

    private String nome;

    private int peso;
    private AnimalType tipo;
    private AnimalMovementAtack velocidadeAtaque;
    private List<AnimalStatus> statusAtual;

    public Animal(String nome, int peso, AnimalType tipo, AnimalMovementAtack velocidadeAtaque) {
    }
}
