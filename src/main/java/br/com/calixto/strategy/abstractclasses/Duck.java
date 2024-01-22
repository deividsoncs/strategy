package br.com.calixto.strategy.abstractclasses;

import br.com.calixto.strategy.intefaces.FlyBehaviorInterface;

public abstract class Duck {

    private String kind;    
    private String color;
    private String weight;
    
    public void display() {
        System.out.println("\n\nLá vem o pato:\n\n" + whoIs());
        System.out.println("\n...Lá vem o pato para ver o que é que há!");
    }
    
    public String whoIs() {
        return getKind() + " | " + getWeight() + " | " + getColor() + "\nAções:\n" + 
                    performQuack() + "\n" +
                    performFly(); 
    }
    
    public abstract String performQuack();
    public abstract String performFly();
    public abstract void setBehaviorOfFly(FlyBehaviorInterface f);

    public String getKind() {
        return kind;
    }
    public void setKind(String tipo) {
        kind = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeight() {
        return this.weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}