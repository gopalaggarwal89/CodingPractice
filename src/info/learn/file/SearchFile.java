package info.learn.file;

import java.io.File;

public class SearchFile {
	
	public static boolean found = false;

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		File dir = new File("D://Gopal");
		checkEachDirectory(dir, "DL.tif");
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken: "+(endTime - startTime) + "ms");
	}

	private static void checkEachDirectory(File root, String fileName) {
		File[] list = root.listFiles();
		if (null != list && !found) {
			for (File dir : list) {
				System.out.println("Current: "+dir.getAbsolutePath());
				if (dir.isDirectory()) {
					checkEachDirectory(dir, fileName);
				} else if (fileName.equalsIgnoreCase(dir.getName())) {
					System.out.println("Founded @" + dir.getAbsolutePath());
					found = true;
				}
				if(found) {
					break;
				}
			}
		}
	}
}
