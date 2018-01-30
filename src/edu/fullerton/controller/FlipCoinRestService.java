package edu.fullerton.controller;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

import edu.fullerton.service.Flip;

@Path("/rest")
public class FlipCoinRestService {

	@GET
	@Path("/coins")
	public Response getFlipCoins(@QueryParam("flips") int flips)
	{
		System.out.println("inside get");
		Flip flipObj = new Flip();
		JSONObject coinsJson = flipObj.flipCoin(flips);
		return Response.status(200).entity(coinsJson.toString()).build();
	}

	@POST
	@Path("/coins")
	public String postFlipCoins(@FormParam("flips") int flips) throws Exception //@PathParam("year") int year @QueryParam("flips") int flips
	{
		Flip flipObj = new Flip();
		JSONObject coinsJson = new JSONObject();
		coinsJson = flipObj.flipCoin(flips);
		return coinsJson.toString();
	}	

}
