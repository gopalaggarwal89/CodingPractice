package info.learn.design.pattern.template;

public class Test {

	public static void main(String[] args) {
		
		HouseTemplate glass = new GlassHouse();
		glass.buildHouse();
		System.out.println("****************************************");
		HouseTemplate brick = new BrickHouse();
		brick.buildHouse();
	}
	
}
