package info.learn.design.pattern.template;

public abstract class HouseTemplate {
	
	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built");
	}
	
	public abstract void buildWalls();
	public abstract void buildPillars();
	
	private void buildFoundation() {
		System.out.println("Foundation");
	}
	
	private void buildWindows() {
		System.out.println("Windows");
	}
}
