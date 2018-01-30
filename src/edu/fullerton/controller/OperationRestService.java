package edu.fullerton.controller;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import org.json.JSONObject;
import edu.fullerton.service.Operation;

@Path("/rest")
public class OperationRestService {
	@GET
	@Path("/add")
	//@Produces(MediaType.APPLICATION_JSON)
	public Response getAdd(@QueryParam("firstNumber") double firstNumber, @QueryParam("secondNumber") double secondNumber)
	{
		System.out.println("inside get");
		System.out.println(firstNumber+"---"+secondNumber);
		Operation operationObj = new Operation();
		JSONObject opJson = operationObj.add(firstNumber, secondNumber);
		return Response.status(200).entity(opJson.toString()).build();
	}
	
	@GET
	@Path("/subtract")
	//@Produces(MediaType.APPLICATION_JSON)
	public Response getSubtract(@QueryParam("firstNumber") double firstNumber, @QueryParam("secondNumber") double secondNumber)
	{
		System.out.println("inside get");
		System.out.println(firstNumber+"---"+secondNumber);
		Operation operationObj = new Operation();
		JSONObject opJson = operationObj.sub(firstNumber, secondNumber);
		return Response.status(200).entity(opJson.toString()).build();
	}
	
	@GET
	@Path("/multiply")
	//@Produces(MediaType.APPLICATION_JSON)
	public Response getMmultiply(@QueryParam("firstNumber") double firstNumber, @QueryParam("secondNumber") double secondNumber)
	{
		System.out.println("inside get");
		System.out.println(firstNumber+"---"+secondNumber);
		Operation operationObj = new Operation();
		JSONObject opJson = operationObj.mul(firstNumber, secondNumber);
		return Response.status(200).entity(opJson.toString()).build();
	}
	
	@GET
	@Path("/divide")
	//@Produces(MediaType.APPLICATION_JSON)
	public Response getDivide(@QueryParam("firstNumber") double firstNumber, @QueryParam("secondNumber") double secondNumber)
	{
		System.out.println("inside get");
		System.out.println(firstNumber+"---"+secondNumber);
		Operation operationObj = new Operation();
		JSONObject opJson = operationObj.div(firstNumber, secondNumber);
		return Response.status(200).entity(opJson.toString()).build();
	}
	
	@POST
	@Path("/add")
	public String postAdd(@FormParam("firstNumber") double firstNumber,@FormParam("secondNumber") double secondNumber) throws Exception //@PathParam("year") int year @QueryParam("flips") int flips
	{
		System.out.println("inside post");
		System.out.println(firstNumber+"---"+secondNumber);
		Operation operationObj = new Operation();
		JSONObject opJson = operationObj.add(firstNumber, secondNumber);
		return opJson.toString();
	}
	@POST
	@Path("/subtract")
	public String postSubtract(@FormParam("firstNumber") double firstNumber,@FormParam("secondNumber") double secondNumber) throws Exception //@PathParam("year") int year @QueryParam("flips") int flips
	{
		System.out.println("inside post");
		System.out.println(firstNumber+"---"+secondNumber);
		Operation operationObj = new Operation();
		JSONObject opJson = operationObj.sub(firstNumber, secondNumber);
		return opJson.toString();
	}	
	@POST
	@Path("/multiply")
	public String postMultiply(@FormParam("firstNumber") double firstNumber,@FormParam("secondNumber") double secondNumber) throws Exception //@PathParam("year") int year @QueryParam("flips") int flips
	{
		System.out.println("inside post");
		System.out.println(firstNumber+"---"+secondNumber);
		Operation operationObj = new Operation();
		JSONObject opJson = operationObj.mul(firstNumber, secondNumber);
		return opJson.toString();
	}	
	@POST
	@Path("/divide")
	public String postDivide(@FormParam("firstNumber") double firstNumber,@FormParam("secondNumber") double secondNumber) throws Exception //@PathParam("year") int year @QueryParam("flips") int flips
	{
		System.out.println("inside post");
		System.out.println(firstNumber+"---"+secondNumber);
		Operation operationObj = new Operation();
		JSONObject opJson = operationObj.div(firstNumber, secondNumber);
		return opJson.toString();
	}	
}
