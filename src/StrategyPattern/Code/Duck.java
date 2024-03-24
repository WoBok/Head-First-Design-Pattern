package StrategyPattern.Code;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void swim() {
        System.out.println("I'm swimming!");
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.Fly();
    }

    public void performQuack() {
        quackBehavior.Quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}