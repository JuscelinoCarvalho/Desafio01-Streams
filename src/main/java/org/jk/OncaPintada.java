package org.jk;

import lombok.Getter;
import lombok.Setter;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
@Setter
public class OncaPintada extends Animal {

    public OncaPintada(String nome, int peso, AnimalType tipo, AnimalMovementAtack velocidadeAtaque) {
        super(nome, peso, tipo, velocidadeAtaque);
        setNome(nome);
        setPeso(peso);
        setTipo(tipo);
        setVelocidadeAtaque(velocidadeAtaque);
        Stream<AnimalStatus> stream = Stream.<AnimalStatus>builder().add(AnimalStatus.ANDANDO).add(AnimalStatus.FAREJANDO).add(AnimalStatus.SONDANDO).build();
        setStatusAtual(stream.collect(Collectors.toList()));
    }


    @Override
    public String toString() {

        return getNome() + " - " + getPeso() + "Kg - Do tipo: " + getTipo().toString();
    }
}
