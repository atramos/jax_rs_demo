/**
 * COPYRIGHT (C) 2015 ZIGABYTE CORPORATION. LICENSE: GPLv3
 */

package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

// TEST: http://localhost:8080/jax_rs_demo/test/hello/world

@Path("/test")
@Produces(MediaType.APPLICATION_JSON)
public class HelloService {

	@GET
	@Path("/hello/{scope}")
	public Response compute(@PathParam("scope") String scope) throws Exception {

		String resp = String.format("Hello, %s!", scope.toUpperCase());
		
		// Respond using Access-Control-Allow-Origin: * to allow use as public JSON API 
		return Response.ok(resp).header("Access-Control-Allow-Origin", "*").build();

	}
}
