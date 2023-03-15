package org.acme;

import org.acme.model.Person;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.jboss.logging.Logger;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class Consumer {

    @Inject
    Logger logger;

    /**
     * Event Hubs namespace
     */ 
    @Incoming("<your-event-hubs-namespace>")
    public void printMessage(Person person) {

        logger.info("¡Success! - Response: Mi nombre es " + person.name + " y tengo " + person.age + " años");
    }
}