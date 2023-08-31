package com.practice;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ReSESTAssuredPractice {
	
	public String reqBody = "{\n "+"\"email\": \"eve.holt@reqres.in\",\n" 
			+ "    \"password\": \"pistol\" \n}";
	
	public String reqBody1 = "{\n"+"\"name\": \"morpheus\",\n"
			+ "    \"job\": \"zion resident\" \n}	";
	
	public String reqBody2 = "{\r\n"
			+ "    \"name\": \"morpheus\",\r\n"
			+ "    \"job\": \"zion resident\"\r\n"
			+ "}";
		    


//"{\n" +
//"  \"title\": \"foo\",\n" +
//"  \"body\": \"bar\",\n" +
//"  \"userId\": \"1\" \n}";
	@Test
	public void getMethod()  
	{
		System.out.println("inside get method");
		
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		
		System.out.println(response.prettyPeek()); 
		
		System.out.println("status code = "+response.getStatusCode());
		
		System.out.println("Time = "+response.getTime());
		
		System.out.println("resbody = "+response.getBody().asString());
		
		System.out.println("contentType = "+response.getContentType());
		
		//Assertion - To compare between expected output and actual output
		int statusCode = response.getStatusCode();
		
	    Assert.assertEquals(statusCode, 200);
	}
	//post("https://reqres.in//api/users")
	
	@Test
	public void postMethod() {
		System.out.println("inside post method");
		Response response = RestAssured
				          .given()
				          .header("Content-type", "application/json")
			              .and()
			              .body(reqBody)
			              .when()
			              .post("https://reqres.in/api/register")
			              .then()
			              .extract().response();
		
		
		Assert.assertEquals(200, response.statusCode());
		//Assert.assertEquals("name", response.jsonPath().getString("morpheus"));
	}
	
	@Test
	public void putMethod() {
		System.out.println("inside put method");
		Response response = RestAssured
							.given()
							.header("Content-type","application/json")
							.and()
							.body(reqBody1)
							.when()
							.put("https://reqres.in/api/users/2")
							.then()
							.extract().response();
	}
	
	@Test
	public void patchMethod() {
		System.out.println("inside patch method");
		Response response = RestAssured
							.given()
							.header("Content-type","application/json")
							.body(reqBody2)
							.when()
							.patch("https://reqres.in/api/users/2")
							.then()
							.extract()
							.response();
		
		System.out.println(response.prettyPeek());
		Assert.assertEquals(200, response.statusCode());
		Assert.assertEquals("zion resident", response.jsonPath().getString("job"));
		
	}
	
	@Test
	public void deleteMethod() {
		System.out.println("inside delete method");
		Response response = RestAssured
							.given()
							.header("Content-type","application/json")
							.when()
							.delete("https://reqres.in/api/users/2")
							.prettyPeek()
							.then()
							.extract()
							.response();
		
		Assert.assertEquals( response.statusCode(),204);
		
				
	}

}
