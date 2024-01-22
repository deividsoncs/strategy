package br.com.calixto.strategy.behavioconcrete.quack;

import br.com.calixto.strategy.intefaces.QuackBehaviorInterface;

public class MuteQuack implements QuackBehaviorInterface{

    @Override
    public String quack() {
        return "... '(não posso emitir sons!)'";
    }
    
}
