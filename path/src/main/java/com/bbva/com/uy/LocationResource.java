package com.bbva.com.uy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/location")
public interface LocationResource {
  @GET
  @Produces("application/json")
  Response generatedMethod1();
}
