package br.com.calixto.strategy.model;

import br.com.calixto.strategy.abstractclasses.Duck;
import br.com.calixto.strategy.behavioconcrete.fly.FlyWithWings;
import br.com.calixto.strategy.behavioconcrete.quack.Quack;
import br.com.calixto.strategy.intefaces.FlyBehaviorInterface;
import br.com.calixto.strategy.intefaces.QuackBehaviorInterface;

public class MallardDuck extends Duck{    

    // por composição o mallard consegue o comportamento de voar adequado;
    // desta maneira eu posso alterar o comportamento de voo que são comuns a todos,
    // em um único lugar, mantendo o cliente desacoplado do comportamente,
    // programando para inteface e não paro código concreto.
    FlyBehaviorInterface fly;
    QuackBehaviorInterface quack;

    public MallardDuck(){
        super.setKind("Mallard Duck");
        super.setColor("Rajado");
        super.setWeight("8 Kg");
        this.fly = new FlyWithWings();
        quack = new Quack();
    }

    @Override
    public String performQuack() {        
        return this.quack.quack();
    }
    @Override
    public String performFly() {        
        return this.fly.fly();
    }

    @Override
    public void setBehaviorOfFly(FlyBehaviorInterface f) {
        this.fly = f;
    }

}