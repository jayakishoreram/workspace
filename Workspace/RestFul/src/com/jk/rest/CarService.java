package com.jk.rest;

import java.util.List;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.PathSegment;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Path("/car/{make}")
public class CarService {

	@GET
	@Path("/{model}/{year}")
	public Response getPicture(@PathParam("make") String make,
			@PathParam("model") String model, @PathParam("year") String year, @MatrixParam("color") String color, @QueryParam("price") int price) {

		String output = "Make: " + make + " model: " + model + " year: " + year + " color: " + color + " price: " + price;
		return Response.status(200).entity(output).build();
	}
	
	
	//Path segments
	
	/*@GET
	@Path("/{model}/A1/{weels}")
	public Response getPathsegments(@PathParam("make") String make,
			@PathParam("model") PathSegment model, @PathParam("weels") PathSegment weels) {
		System.out.println("Matrix param: "+ model.getMatrixParameters().getFirst("color"));
		System.out.println("Matrix param: "+ weels.getMatrixParameters().getFirst("color"));
		String output = "Make: " + make + " model: " + model;
		return Response.status(200).entity(output).build();
	}*/
	
	//Path segments
	
		/*@GET
		@Path("/{model}/A1/{weels}")
		public Response getQueryParameters(@PathParam("make") String make,
				@PathParam("model") PathSegment model, @PathParam("weels") PathSegment weels) {
			System.out.println("Matrix param: "+ model.getMatrixParameters().getFirst("color"));
			System.out.println("Matrix param: "+ weels.getMatrixParameters().getFirst("color"));
			String output = "Make: " + make + " model: " + model;
			return Response.status(200).entity(output).build();
		}*/
	
	@GET
	@Path("/{model}")
	public Response getQueryParameters(@Context UriInfo uriInfo) {
		System.out.println("Absolute Path:    "+uriInfo.getAbsolutePath());
		System.out.println("Path: "+uriInfo.getPath());
		System.out.println("Base URI:  "+uriInfo.getBaseUri());
		System.out.println("Request URI:  "+uriInfo.getRequestUri());
		List<String> matchedUris = uriInfo.getMatchedURIs();
		System.out.println("Matched URIs Size:  "+matchedUris.size());
		for(String matchedURI:matchedUris)
			System.out.println("Matched URIS: "+ matchedURI);
		
		System.out.println("**************************Path Parameters***************");
		MultivaluedMap<String, String> pathParams = uriInfo.getPathParameters();
		Set<String> entrySet = pathParams.keySet();
		for(String key: entrySet){
			System.out.println("Key: "+key + " Value:  "+pathParams.getFirst(key) );
		}
			
		System.out.println("**************************Query Parameters***************");
		MultivaluedMap<String, String> queryParams = uriInfo.getQueryParameters();
		Set<String> queryParamEntrySet = queryParams.keySet();
		for(String key: queryParamEntrySet){
			System.out.println("Key: "+key + " Value:  "+queryParams.getFirst(key) );
		}
		
		System.out.println("**************************Path Segments***************");
		List<PathSegment> pathSegments = uriInfo.getPathSegments();
		
		for(PathSegment segment: pathSegments){
			System.out.println("path Segment: "+ segment);
			System.out.println("Matrix Pareameter: "+segment.getMatrixParameters().getFirst("color") );
		}
		return Response.status(200).entity("SYSO out").build();
	}

}
