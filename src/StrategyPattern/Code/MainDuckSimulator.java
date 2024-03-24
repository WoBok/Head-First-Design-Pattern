package StrategyPattern;

public class MainDuckSimulator {
    public static void main(String[] args) {
        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.performFly();
        decoyDuck.performQuack();

        decoyDuck.setFlyBehavior(new FlyWithWings());
        decoyDuck.setQuackBehavior(new Squeak());

        decoyDuck.performFly();
        decoyDuck.performQuack();
    }
}