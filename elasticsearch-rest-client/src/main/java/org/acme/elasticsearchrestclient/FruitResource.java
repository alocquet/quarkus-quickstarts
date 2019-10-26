package org.acme.elasticsearchrestclient;

import org.acme.elasticsearchrestclient.model.Fruit;
import org.acme.elasticsearchrestclient.model.elastic.Hit;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/fruits")
public class FruitResource {

    @Inject
    private FruitService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Hit<Fruit>> list() {
        return service.list();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String list(final Fruit fruit) {
        return service.add(fruit);
    }
}