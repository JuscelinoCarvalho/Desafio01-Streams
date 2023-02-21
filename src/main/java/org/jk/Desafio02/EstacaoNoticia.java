package org.jk.Desafio02;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;



@Getter
@Setter
public class EstacaoNoticia implements IEstacaoNoticia {
    private List<RadiosLocaisObs> radiosLocaisObs = new ArrayList<>();
    private Noticia localNews;
    public EstacaoNoticia(Noticia news){
         localNews = new Noticia(news.getNomeEditor(), news.getHoraNoticia(), news.getConteudo());
    }
    @Override
    public void register(RadiosLocaisObs radioLocalObs) {
        this.radiosLocaisObs.add(radioLocalObs);
    }
    @Override
    public void unregister(RadiosLocaisObs radioLocalObs) {
        this.radiosLocaisObs.remove(radioLocalObs);
    }
    public void notifyTodos(){
        for(RadiosLocaisObs o : radiosLocaisObs){
            o.update(this.localNews);
        }
    }
}
