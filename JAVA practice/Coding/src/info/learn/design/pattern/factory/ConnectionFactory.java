package info.learn.design.pattern.factory;

public class ConnectionFactory {	
	
	public static Connection getConnection(String connectionString) {
		Connection connection = new S3();
		if("AWS".equals(connectionString)) {
			connection = new AWS();
		}		
		return connection;
		
	}

}
