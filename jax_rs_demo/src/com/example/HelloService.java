/**
 * COPYRIGHT (C) 2015 ZIGABYTE CORPORATION. ALL RIGHTS RESERVED.
 *
 * CONFIDENTIAL AND PROPRIETARY
 *
 * 		This file is an unpublished Trade Secret of Zigabyte Corporation.
 * 		Theft or misappropriation of Trade Secrets is a federal crime prosecutable
 * 		under the U.S. Industrial Espionage Act of 1996, 18 U.S.C. §§ 1831-1839;
 * 		it is also a crime in all World Trade Organization member countries.
 *
 * NON-DISCLOSURE AGREEMENT
 *
 * 		If you received a copy of this file in order to perform a work for hire, you agree to delete
 * 		all copies of this and other received files as soon as the work is no longer in progress.
 *		Opening of this file constitutes acceptance of the agreement for all files in this project.
 */

package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ctc.cma.UnitInfoClassifier;

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
