package com.jk.rest;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorkService {
	
	@GET
	@Path("/{param}")
	public Response getMessage(@PathParam("param") String param){
		
		String output = "Jersy Say: "+ param;
		return Response.status(200).entity(output).build();
	}
	
	@GET
	public Response getUser(){
		
		return Response.status(200).entity("I am simple user.").build();
	}
	
	@GET
	@Path("/previlage")
	public Response getPrivilazedUser(){
		
		return Response.status(200).entity("I am Privilazed User").build();
	}
	
	@GET
	@Path("/{year}/{month}/{day}")
	public Response getDate(@PathParam("year") int year, @PathParam("month") int month, @PathParam("day") int day){
		
		return Response.status(200).entity("Query date: "+new Date(day, month, year)).build();
		//return Response.status(200).entity("Query date: "+ year + "/"+ month+ "/"+day).build();
	}
	
}
