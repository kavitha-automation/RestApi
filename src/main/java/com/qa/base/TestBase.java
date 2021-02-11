package com.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

	public Properties prop;

	public TestBase() {

		try {
			 prop= new Properties();
FileInputStream ip=new FileInputStream("/Users/gokul/eclipse-workspace/restapi/src/main/java/com/qa/congif/config.properties");
prop.load(ip);
}
catch(FileNotFoundException e) {
	e.printStackTrace();
}
catch(IOException e) {
e.printStackTrace();
}

}


}
