package abstraction;

abstract class Atm {

	abstract void withdraw();
}

 class DataAbstraction extends Atm {

	@Override
	void withdraw() {
			System.out.println("withdraw successful");
	}
	public static void main(String[] args) {
		DataAbstraction ob1 = new DataAbstraction();
		ob1.withdraw();
	
	}
	
}
