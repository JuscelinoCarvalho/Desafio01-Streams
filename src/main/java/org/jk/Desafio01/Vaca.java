package org.jk.Desafio01;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Vaca extends Animal{
    public Vaca(String nome, int peso, AnimalType tipo, AnimalMovementAtack velocidadeAtaque) {
        super(nome, peso, tipo, velocidadeAtaque);
        setNome(nome);
        setPeso(peso);
        setTipo(tipo);
        setVelocidadeAtaque(velocidadeAtaque);
        Stream<AnimalStatus> stream = Stream.<AnimalStatus>builder().add(AnimalStatus.COMENDO).add(AnimalStatus.PARADO).build();
        setStatusAtual(stream.collect(Collectors.toList()));
    }

    @Override
    public String toString() {
        return getNome() + " - " + getPeso() + "Kg - Do tipo: " + getTipo().toString();
    }
}