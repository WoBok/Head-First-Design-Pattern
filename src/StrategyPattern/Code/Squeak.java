package StrategyPattern.Code;

public class Squeak implements QuackBehavior {
    @Override
    public void Quack() {
        System.out.println("Squack!");
    }
}