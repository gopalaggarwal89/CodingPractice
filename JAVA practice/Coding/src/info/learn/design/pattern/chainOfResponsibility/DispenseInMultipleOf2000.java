package info.learn.design.pattern.chainOfResponsibility;

public class DispenseInMultipleOf2000 implements DispenseChain{
	
	@Override
	public void setNextChain(DispenseChain nextChain) {
			
	}

	@Override
	public void dispense(Currency number) {
		int value = number.getAmount() % 2000;
		if(value == 2000) {
			int count = number.getAmount() / 2000;
			System.out.println("Dispensing "+count+" $2000 notes");
		}else {
			System.out.println("Can dispense only in multiplese of 50, 100, 2000");
		}
	}

	
	
	
}
