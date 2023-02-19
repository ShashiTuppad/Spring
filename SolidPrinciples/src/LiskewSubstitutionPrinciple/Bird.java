package LiskewSubstitutionPrinciple;

public abstract class Bird implements Bird1 {

	public abstract void fly();
	@Override
	public void cantFly() {
		System.out.println("Ostrich can't fly");
	}

}
