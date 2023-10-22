package dev.thales.gof;

import dev.thales.gof.facade.Facade;
import dev.thales.gof.singleton.SingletonEager;
import dev.thales.gof.singleton.SingletonLazy;
import dev.thales.gof.singleton.SingletonLazyHolder;
import dev.thales.gof.strategy.Comportamento;
import dev.thales.gof.strategy.ComportamentoAgressivo;
import dev.thales.gof.strategy.ComportamentoDefensivo;
import dev.thales.gof.strategy.ComportamentoNormal;
import dev.thales.gof.strategy.Robo;

public class Teste {
    public static void main(String[] args) {
    SingletonLazy lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);
    lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);

    SingletonEager eager = SingletonEager.getInstancia();
    System.out.println(eager);
    eager = SingletonEager.getInstancia();
    System.out.println(eager);

    SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(lazyHolder);
    lazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(lazyHolder);
    
    //Strategy

		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();

		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");
    }

    
}