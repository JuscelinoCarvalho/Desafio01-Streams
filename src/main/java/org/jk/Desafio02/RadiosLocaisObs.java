package org.jk.Desafio02;

import java.time.format.DateTimeFormatter;

public class RadiosLocaisObs implements IRadiosLocaisObs {
    private final String nome;
    public RadiosLocaisObs(String nome){
        this.nome = nome;
    }

    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    @Override
    public void update(Noticia news) {
        System.out.println("ESATACAO..: " + this.nome
                + "\nEditor..: "
                + news.getNomeEditor()
                + "\nHora Atual..: "
                + news.getHoraNoticia().format(format)
                + "\nNOTICIAS...: " + news.getConteudo()
        );
    }
}
