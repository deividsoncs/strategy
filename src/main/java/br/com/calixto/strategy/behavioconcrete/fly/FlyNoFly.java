package br.com.calixto.strategy.behavioconcrete.fly;

import br.com.calixto.strategy.intefaces.FlyBehaviorInterface;

public class FlyNoFly implements FlyBehaviorInterface{

    public String fly() {
        return "Não posso voar :(";
    }
    
}
