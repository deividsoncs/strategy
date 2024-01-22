package br.com.calixto.strategy.model;

import br.com.calixto.strategy.abstractclasses.Duck;
import br.com.calixto.strategy.behavioconcrete.fly.FlyNoFly;
import br.com.calixto.strategy.behavioconcrete.quack.Whistle;
import br.com.calixto.strategy.intefaces.FlyBehaviorInterface;
import br.com.calixto.strategy.intefaces.QuackBehaviorInterface;

public class RubberDuck extends Duck{

    FlyBehaviorInterface fly;
    QuackBehaviorInterface quack;

    public RubberDuck(){
        super.setKind("Rubber Duck");
        super.setColor("yellow");
        super.setWeight("0,05 Kg");
        this.fly = new FlyNoFly();
        this.quack = new Whistle();
    }    

    @Override
    public String performQuack() {        
        return this.quack.quack();
    }
    @Override
    public String performFly() {        
        return this.fly.fly();
    }

    // muda o tipo de voo em tempo de execução.
    @Override
    public void setBehaviorOfFly(FlyBehaviorInterface newBehaviorToFly) {
        this.fly = newBehaviorToFly;
    }
}
