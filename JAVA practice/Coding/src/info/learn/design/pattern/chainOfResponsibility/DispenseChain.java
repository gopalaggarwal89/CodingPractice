package info.learn.design.pattern.chainOfResponsibility;

public interface DispenseChain {
		
	public void setNextChain(DispenseChain nextChain);
	public void dispense(Currency currency);
}
