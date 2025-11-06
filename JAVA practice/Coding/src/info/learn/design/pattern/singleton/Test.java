package info.learn.design.pattern.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class Test
{

    public static void main(String[] args) throws
        FileNotFoundException,
        IOException,
        InstantiationException,
        IllegalAccessException,
        IllegalArgumentException,
        InvocationTargetException
    {

        ProcessId process = ProcessId.getInstance();
        Properties properties = new Properties();
        properties.load(new FileInputStream(process.getPropertyFile()));
        System.out.println(properties.getProperty("database"));

//		ProcessId processId = null;	

        //Reflection logic to create object of singleton class
//		Constructor[] temp = ProcessId.class.getDeclaredConstructors();
//		for(Constructor constructor : temp) {
//			constructor.setAccessible(true);
//			processId = (ProcessId) constructor.newInstance();
//		}

        System.out.println(process.hashCode());
//		System.out.println(processId.hashCode());

    }
}