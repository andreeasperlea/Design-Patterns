package SimUDuck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard=new MallardDuck();
		mallard.performQuack();
		mallard.performFlying();
		
		Duck model=new ModelDuck();
		model.performFlying();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFlying();
		
	}

}
