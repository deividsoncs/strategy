package br.com.calixto.strategy.model;

import br.com.calixto.strategy.abstractclasses.Duck;
import br.com.calixto.strategy.behavioconcrete.fly.FlyNoFly;
import br.com.calixto.strategy.behavioconcrete.quack.MuteQuack;
import br.com.calixto.strategy.intefaces.FlyBehaviorInterface;
import br.com.calixto.strategy.intefaces.QuackBehaviorInterface;

public class DecoyDuck extends Duck{

    FlyBehaviorInterface fly;
    QuackBehaviorInterface quack;

    public DecoyDuck(){
        super.setKind("Decoy Duck");
        super.setColor("Gray");
        super.setWeight("1 Kg");
        this.fly = new FlyNoFly();
        this.quack = new MuteQuack();
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