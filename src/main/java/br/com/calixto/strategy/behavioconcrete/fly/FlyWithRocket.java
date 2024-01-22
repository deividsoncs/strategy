package br.com.calixto.strategy.behavioconcrete.fly;

import br.com.calixto.strategy.intefaces.FlyBehaviorInterface;

public class FlyWithRocket implements FlyBehaviorInterface {


    public FlyWithRocket(){}

    public String fly() {
        return "Estou voando de Foguete! 'This is Major Tom to ground control...'";
    }
    
}
