package learning.vladdubceac.decorator.implementation;

import learning.vladdubceac.decorator.abstraction.AbstractDecorator;

public class ConcreteDecorate1 extends AbstractDecorator {
    public void doJob(){
        super.doJob();

        // add additional responsibilities
        System.out.println("I am explicitly from ConcreteDecorate1");
    }
}
