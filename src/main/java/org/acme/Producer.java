package org.acme;

import org.acme.model.Person;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import com.fasterxml.jackson.core.JsonProcessingException;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/demo-kafka-eventhubs-json")
public class Producer {

    @Inject
    @Channel("generated-message")
    Emitter<Person> emitter;

    @GET
    @Path("/send")
    public void sendPerson() throws JsonProcessingException {
        
        Person person = new Person("Person", 20);

        emitter.send(person);
    }
}