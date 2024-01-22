package br.com.calixto.strategy.behavioconcrete.quack;

import br.com.calixto.strategy.intefaces.QuackBehaviorInterface;

public class Quack implements QuackBehaviorInterface {

    public String quack() {
        return "Quack quack! Sou um pato que consegue grasnar.";
    }
    
}
