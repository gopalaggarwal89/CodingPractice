package info.learn.multithreading;

import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SearchFile implements Runnable {

	private String dirPath = null;
	
	//volatile static is used to indicate all the threads that file is founded by one of the running threads.
	//This flag will help running threads to avoid executing recursion logic5
	public volatile static boolean flag = false;

	public SearchFile() {

	}

	public SearchFile(String dirPath) {
		this.dirPath = dirPath;
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		File dir = new File("D://Gopal");
		checkRootDirectory(dir);
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken: "+(endTime - startTime) + "ms");
	}

	private static void checkRootDirectory(File root) {
		//FileFilter checks child in root directory
		//FilenameFilter - It is not used as isDirectory() api was returning true for File object
		//This happens as FilenameFilter always returns file object of parent
		File[] list = root.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				return pathname.isDirectory() && !pathname.isHidden();
			}
		});

		ExecutorService service = Executors.newFixedThreadPool(list.length);
		for (File directories : list) {
			String dirPath = directories.getAbsolutePath();
			Thread thread = new Thread(new SearchFile(dirPath));
			service.execute(thread);
		}
		//If we will not use shutDown() then threads will not terminated after work done
		service.shutdown();
		//Check for all threads must terminated
		while(!service.isTerminated()) {
			
		}
	}

	@Override
	public void run() {
		checkEachDirectory(new File(dirPath), "DL.tif");
	}

	private void checkEachDirectory(File root, String fileName) {
		File[] list = root.listFiles();
		if (null != list && !flag) {
			for (File dir : list) {
//				System.out.println(
//						flag+" Thread name: " + Thread.currentThread().getName() + " Current: " + dir.getAbsolutePath());
				if (dir.isDirectory() && !dir.isHidden()) {
					checkEachDirectory(dir, fileName);
				} else if (fileName.equalsIgnoreCase(dir.getName())) {
					flag = true;
					System.out.println(
							flag+" Thread name: " + Thread.currentThread().getName() + " Founded @" + dir.getAbsolutePath());
				}
				
				if(flag) {
					break;
				}
			}
		}
	}
}