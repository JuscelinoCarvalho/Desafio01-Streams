package org.jk.Desafio02;

public interface IEstacaoNoticia {

    public void register(RadiosLocaisObs radioLocalObs);
    public void unregister(RadiosLocaisObs radioLocalObs);
    public void notifyTodos();
}
