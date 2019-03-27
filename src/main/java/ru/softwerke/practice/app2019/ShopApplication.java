package ru.softwerke.practice.app2019;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;
import ru.softwerke.practice.app2019.model.SomeEntity;
import ru.softwerke.practice.app2019.service.SomeService;
import ru.softwerke.practice.app2019.service.SomeServiceImpl;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
public class ShopApplication extends ResourceConfig {
    public ShopApplication() {
        packages("ru.softwerke.practice.app2019;com.fasterxml.jackson.jaxrs");

        register(new AbstractBinder() {
            @Override
            protected void configure() {
                bind(someService()).to(SomeService.class);
            }
        });
    }

    private SomeService someService() {
        SomeService service = new SomeServiceImpl();
        service.putEntity(new SomeEntity(0, "first"));
        return service;
    }
}
