package com.sandeep.practice.config;

import java.util.Base64;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.sandeep.practice.annotation.Loggable;
import com.sandeep.practice.util.TwitterEndpointsConstant;


@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix="twitter")
public class ConfigProperties {
	
	@Autowired 
	RestTemplate restClient;
	
	
	private String consumerApi;
	private String consumerApiSecret;
	private String accessToken;
	private String accessTokenSecret;
	
	private String authToken;

	

	@Loggable
	public String getConsumerApi() {
		return consumerApi;
	}
	@Loggable
	public String getConsumerApiSecret() {
		return consumerApiSecret;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public String getAccessTokenSecret() {
		return accessTokenSecret;
	}
	public void setConsumerApi(String consumerApi) {
		this.consumerApi = consumerApi;
	}
	public void setConsumerApiSecret(String consumerApiSecret) {
		this.consumerApiSecret = consumerApiSecret;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public void setAccessTokenSecret(String accessTokenSecret) {
		this.accessTokenSecret = accessTokenSecret;
	}
	
	@PostConstruct
	public void getBearerToken()
	{
		 String conKeys=consumerApi.concat(":").concat(consumerApiSecret);
		 //encoding the keys using Base64 encoder
		 String encodedString=Base64.getEncoder().encode(conKeys.getBytes()).toString();
		 String authToken=getToken(encodedString);
	}
	
	
	private String getToken(String encodedString)
	{
		String url=TwitterEndpointsConstant.BASE_URL+TwitterEndpointsConstant.AUTHTOKEN_POST;
		HttpHeaders headers=new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		headers.set("grant_type","client_credentials");
		headers.set("Authorization","Basic "+encodedString);
		
		HttpEntity entity=new HttpEntity<>(headers);
		
		ResponseEntity response=restClient.exchange(url, HttpMethod.POST,entity,Map.class);
        if(response !=null && !response.equals(""))
        {
        	System.out.println(response.getBody());
        	Map token=(Map)response.getBody();
        	
        	token.forEach((k,v) -> System.out.println(k+":::"+v));
        }
		return "abc";
	}

	

}
