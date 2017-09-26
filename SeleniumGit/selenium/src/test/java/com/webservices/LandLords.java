package com.webservices;

import org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import utilities.PropertiesManager;

import static org.hamcrest.Matchers.is;
import static com.jayway.restassured.RestAssured.given;

public class LandLords {

	@Test
	public void GetlandLords() {
		/*given().accept(ContentType.JSON).
				when().get("http://localhost:8080/landlords/").then().statusCode(200);*/
		Response resp = given()
			    .contentType("application/json")
			    
			    			    .get(PropertiesManager.PROPERTIES.getProperty("rest_url"));
		
		System.out.println(resp.asString());
	}

	
	
	@Test
	public void PostlandLords() {
		/*given().accept(ContentType.JSON).
				when().get("http://localhost:8080/landlords/").then().statusCode(200);*/
		Response resp = given()
			    .contentType("application/json")
			    			    .get(PropertiesManager.PROPERTIES.getProperty("rest_url"));
		
		System.out.println(resp.asString());
	}
	
	@Test
	public void DeletelandLords() {
		/*given().accept(ContentType.JSON).
				when().get("http://localhost:8080/landlords/").then().statusCode(200);*/
		Response resp = given()
			    .contentType("application/json")
			    			    .get(PropertiesManager.PROPERTIES.getProperty("rest_url"));
		
		System.out.println(resp.asString());
	}
	
	@Test
	public void PutlandLords() {
		/*given().accept(ContentType.JSON).
				when().get("http://localhost:8080/landlords/").then().statusCode(200);*/
		Response resp = given()
			    .contentType("application/json")
			    			    .get(PropertiesManager.PROPERTIES.getProperty("rest_url"));
		
		System.out.println(resp.asString());
	}
	
}
