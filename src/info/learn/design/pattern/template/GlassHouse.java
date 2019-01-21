package info.learn.design.pattern.template;

public class GlassHouse extends HouseTemplate{

	@Override
	public void buildPillars() {
		System.out.println("Glass house pillars");
		
	}


	@Override
	public void buildWalls() {
		System.out.println("Glass house walls");
		
	}
}
