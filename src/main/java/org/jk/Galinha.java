package org.jk;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
public class Galinha extends Animal{
    public Galinha(String nome, int peso, AnimalType tipo, AnimalMovementAtack velocidadeAtaque) {
        super(nome, peso, tipo, velocidadeAtaque);
        setNome(nome);
        setPeso(peso);
        setTipo(tipo);
        setVelocidadeAtaque(velocidadeAtaque);
        Stream<AnimalStatus> stream = Stream.<AnimalStatus>builder().add(AnimalStatus.SONDANDO).add(AnimalStatus.COMENDO).build();
        setStatusAtual(stream.collect(Collectors.toList()));
        }

    @Override
    public String toString() {
        return getNome() + " - " + getPeso() + "Kg - Do tipo: " + getTipo().toString();
    }
}
