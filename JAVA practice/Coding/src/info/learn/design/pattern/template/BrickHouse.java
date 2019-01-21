package info.learn.design.pattern.template;

public class BrickHouse extends HouseTemplate{

	@Override
	public void buildWalls() {
		System.out.println("Brick walls");
	}

	@Override
	public void buildPillars() {
		System.out.println("Brick pillars");
		
	}

}
