package org.ivagulin;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class TestService {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public TestData get(){
		return new TestData("Hello", "World");
	}
}
