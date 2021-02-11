package com.qa.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {

public void get(String url) throws ClientProtocolException, IOException {
CloseableHttpClient httpClient=HttpClients.createDefault();
HttpGet httpGet = new HttpGet(url);

CloseableHttpResponse closeablehttpResponse=httpClient.execute(httpGet);
int statusCode=closeablehttpResponse.getStatusLine().getStatusCode();
System.out.println(statusCode);
String responseString = EntityUtils.toString(closeablehttpResponse.getEntity(),"UTF-8");
JSONObject responseJson = new JSONObject(responseString);
System.out.println(responseJson);

Header[] headersArray=closeablehttpResponse.getAllHeaders();
HashMap<String,String>allHeaders= new HashMap<String,String>();
for(Header header:headersArray) {
allHeaders.put(header.getName(),header.getValue());
}
System.out.println(allHeaders);


}
}