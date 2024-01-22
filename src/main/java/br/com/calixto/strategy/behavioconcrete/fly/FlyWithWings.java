package br.com.calixto.strategy.behavioconcrete.fly;

import br.com.calixto.strategy.intefaces.FlyBehaviorInterface;

public class FlyWithWings implements FlyBehaviorInterface{

    public String fly() {
        return "Eu posso voar! =D";
    }
    
}
