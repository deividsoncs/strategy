package br.com.calixto.strategy;

import br.com.calixto.strategy.behavioconcrete.fly.FlyWithRocket;
import br.com.calixto.strategy.model.DecoyDuck;
import br.com.calixto.strategy.model.MallardDuck;
import br.com.calixto.strategy.model.RubberDuck;

/**
 * Hello Duck, implemetando o  design pattern: Strategy!
 * Baseado no livro Ahead first Padrões de Projeto 2ª Edição
 * Eric Freeman & Elisabeth Freeman
 * 
 * @author D.Calixto
 */
public class AppStrategy {
    public static void main( String[] args )
    {
        System.out.println( "A Duck System" );
        System.out.println( "    <()____" );
        System.out.println( "     |l___ " );
        System.out.println( "    (______)" );
        System.out.println( "~~~~~~λ λ~~~~~~~~~~" );
        

        MallardDuck mallard = new MallardDuck();
        mallard.display();

        RubberDuck rubber = new RubberDuck();
        rubber.display();

        // exemplo e interoperabilidade onde pode-se mudar o comportamento do cliente apenas passando a implementação
        // da inteface para o cliente de (rubber duck);
        System.out.println("======= Rubber duck agora com 'foguetes' interoperáveis em tempo de execução======");
        rubber.setBehaviorOfFly(new FlyWithRocket());
        rubber.display();

        DecoyDuck decoy = new DecoyDuck();
        decoy.display();
        
    }
}
