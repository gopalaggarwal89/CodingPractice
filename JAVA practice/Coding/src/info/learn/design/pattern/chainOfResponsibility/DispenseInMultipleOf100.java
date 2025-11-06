package info.learn.design.pattern.chainOfResponsibility;

public class DispenseInMultipleOf100 implements DispenseChain{
	
	private DispenseChain nextInChain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.nextInChain = nextChain;
		
	}

	@Override
	public void dispense(Currency number) {
		int value = number.getAmount() % 100;
		if(value == 0) {
			int count = number.getAmount() / 100;
			System.out.println("Dispensing "+count+" $100 notes");
		}else {
			nextInChain.dispense(number);
		}		
	}

}
