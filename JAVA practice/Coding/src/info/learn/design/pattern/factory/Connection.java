package info.learn.design.pattern.factory;

public abstract class Connection {

	public abstract String getConnection();

	@Override
	public String toString() {
		return "Connection [getConnection()=" + getConnection();
	}
}
