package org.jk.Desafio02;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Noticia {
    private String nomeEditor;
    private LocalDateTime horaNoticia;
    private String conteudo;

    public Noticia(String nomeEditor, LocalDateTime horaNoticia, String conteudo){
        this.nomeEditor = nomeEditor;
        this.horaNoticia = horaNoticia;
        this.conteudo = conteudo;
    }
}
