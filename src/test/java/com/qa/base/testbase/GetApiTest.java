package com.qa.base.testbase;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;

public class GetApiTest extends TestBase {
TestBase testbase;
String serviceUrl;
String apiUrl;	
String url;
RestClient restClient;

@BeforeMethod
public void setUp() throws ClientProtocolException, IOException {
testbase=new TestBase();
 serviceUrl=prop.getProperty("URL");
apiUrl=prop.getProperty("serviceURL");
	
	url=serviceUrl+apiUrl;
	 
	}
@Test
public void getAPITest() throws ClientProtocolException, IOException {

	restClient= new RestClient();
	restClient.get(url);
	
}
}
