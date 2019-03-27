package ru.softwerke.practice.app2019.controller.rest;

import ru.softwerke.practice.app2019.model.SomeEntity;
import ru.softwerke.practice.app2019.service.SomeService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * With DI by Igor. Don't use it for now
 */
@Path("some-entity")
@Produces("application/json;charset=utf-8")
public class SomeRestResource {
    private final SomeService someService;

    @Inject
    public SomeRestResource(SomeService someService) {
        this.someService = someService;
    }

    @GET
    public List<SomeEntity> listSomeEntity() {
        return someService.getList();
    }

    @GET
    @Path("{id}")
    public SomeEntity getSomeEntityById(@PathParam("id") Long id) {
        SomeEntity result = someService.getEntity(id);
        if (result == null) {
            throw new NotFoundException("Could not find SomeEntity with id " + id);
        }
        return result;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public SomeEntity createSomeEntity(SomeEntity someEntity) {
        return someService.putEntity(someEntity);
    }
}
