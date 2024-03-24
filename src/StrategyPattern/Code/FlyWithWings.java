package StrategyPattern.Code;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void Fly() {
        System.out.println("I'm flying with wings");
    }
}