package info.learn.design.pattern.factory;

public class Test {

	public static void main(String[] args) {
		
		Connection s3 = ConnectionFactory.getConnection("S3");
		System.out.println(s3.getConnection());
		
		Connection aws = ConnectionFactory.getConnection("AWS");
		System.out.println(aws.getConnection());
	}
	
}
