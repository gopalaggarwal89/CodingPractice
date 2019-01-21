package info.learn.design.pattern.singleton;

import java.io.File;

public class ProcessId {

	private ProcessId() {

	}

	private static File file;

	private static volatile ProcessId processId;

	public static ProcessId getInstance() {
		if (null == processId) {
			synchronized (ProcessId.class) {
				if (processId == null) {
					processId = new ProcessId();
					file = new File("C:\\Users\\gkaggarw\\Desktop\\config.properties");
				}
			}
		}
		return processId;
	}

	public File getPropertyFile() {
		return file;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Cannot clone instance of this class");
	}
}
