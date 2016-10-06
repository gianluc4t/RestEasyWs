package it.gt.poc.resteasy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/message")
public class RestService {
	
	@GET
	@Path("/{param}")
	public Response printMessage(@PathParam("param") String msg) {

		String message = "questo é solo un messaggio per  " + msg;

		return Response.status(200).entity(message).build();

	}
}
