package Desafio04Teste;

import io.reactivex.rxjava3.core.*;
import org.jk.Desafio01.*;
import org.junit.Test;


public class Desafio04Teste {

    AnimalList animais = new AnimalList();
    OncaPintada onca = new OncaPintada( "ONÇA PINTADA", 80,AnimalType.CARNIVORO, AnimalMovementAtack.VERYFAST);
    Galinha galinha = new Galinha("GALINHA", 2,AnimalType.ONIVORO,AnimalMovementAtack.NOATACK);

    private static Observable<AnimalList> obj;
    public void start(){
        animais.add(onca);
        animais.add(galinha);
        obj = Observable.just(animais);
    }

    public void clearAll() {
        obj=null;
        animais.clear();
    }

    @Test
    public void Teste01() {
        System.out.println("Testando 01....\n");
        // mvn test -Dtest="Desafio04Teste#Teste01"
        start();
        //Teste 01
        Completable.complete()
                .test()
                .assertResult();
        clearAll();
    }

    @Test
    public void Teste02() {
        System.out.println("Testando 02....\n");
        //mvn test -Dtest="Desafio04Teste#Teste02"
        start();
        //Teste02
        obj
                .test()
                .assertResult(animais);
        clearAll();
    }

    @Test
    public void Teste03() {
        System.out.println("Testando 03....\n");
        // mvn test -Dtest="Desafio04Teste#Teste03"
        start();
        //Teste03
        Maybe
                .just(onca)
                .test()
                .assertResult(onca);
        clearAll();
    }

    @Test
    public void Teste04() {
        System.out.println("Testando 04....\n");
        // mvn test -Dtest="Desafio04Teste#Teste04"
        start();
        //Teste04
        Observable.just(obj)
                .test()
                .assertValueAt(0, obj)
                .equals(onca);
        clearAll();
    }

    @Test
    public void Teste05() {
        System.out.println("Testando 05....\n");
        // mvn test -Dtest="Desafio04Teste#Teste05"
        start();
        /*
        Teste05
        TestSubscriber<AnimalList> subs = new TestSubscriber<>();
        obj.elementAt(1).subscribe();
        obj.subscribe((Observer) obj);
        TODO:
        */

        clearAll();
    }
}
