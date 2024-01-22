package br.com.calixto.strategy.behavioconcrete.quack;

import br.com.calixto.strategy.intefaces.QuackBehaviorInterface;

public class Whistle implements QuackBehaviorInterface {

    public String quack() {
        return "Fiu Fiu! Sou uma pato que assovia!";
    }
}