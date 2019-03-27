package ru.softwerke.practice.app2019.controller.rest;

import ru.softwerke.practice.app2019.model.Customer;
import ru.softwerke.practice.app2019.service.CustomerDataService;
import ru.softwerke.practice.app2019.service.CustomerDataServiceImpl;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * No DI by Alex
 * From https://www.logicbig.com/tutorials/java-ee-tutorial/jax-rs/post-example.html
 */
@Path("customer")
public class CustomerRestController {
    private CustomerDataService customerDataService = CustomerDataServiceImpl.getInstance();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> getItem() {
        return customerDataService.getCustomerList();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String createCustomer(Customer customer) {
        return customerDataService.addCustomer(customer);
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer getCustomer(@PathParam("id") String id) {
        return customerDataService.getCustomerById(id);
    }
}
