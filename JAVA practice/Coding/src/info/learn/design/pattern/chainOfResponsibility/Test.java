package info.learn.design.pattern.chainOfResponsibility;

public class Test {
	
	public static void main(String[] args) {
		
		DispenseChain chain = new DispenseInMultiplesOf50();
		DispenseChain chain1 = new DispenseInMultipleOf100();
		DispenseChain chain2 = new DispenseInMultipleOf2000();
		
		chain.setNextChain(chain1);
		chain1.setNextChain(chain2);
		
		Currency curreny = new Currency(520);
		chain.dispense(curreny);
	}

}
