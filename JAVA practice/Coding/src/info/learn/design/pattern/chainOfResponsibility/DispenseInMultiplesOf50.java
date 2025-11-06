package info.learn.design.pattern.chainOfResponsibility;

public class DispenseInMultiplesOf50 implements DispenseChain{
	
	private DispenseChain nextInChain;	

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.nextInChain = nextChain;
		
	}

	@Override
	public void dispense(Currency number) {
		int value = number.getAmount() % 50;
		if(value == 0) {
			int count = number.getAmount() / 50;
			System.out.println("Dispensing "+count+" $50 notes");
		}else {
			nextInChain.dispense(number);
		}
	}

}
