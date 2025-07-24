package SimUDuck;

public abstract class Duck {
	FlyBehaviour flyBehavior;
	QuackBehaviour quackBehavior;
	
	
	public FlyBehaviour getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehaviour flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public QuackBehaviour getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehaviour quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public Duck(){
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void performFlying() {
		flyBehavior.fly();
	}

	public void swim() {
		System.out.println("All ducks float");
	}
	
	public abstract void display();
}
