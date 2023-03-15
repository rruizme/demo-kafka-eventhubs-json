package org.acme.model;

import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class PersonDeserializer extends ObjectMapperDeserializer<Person> {

    public PersonDeserializer() {

        super(Person.class);
    }
}
