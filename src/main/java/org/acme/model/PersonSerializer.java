package org.acme.model;

import io.quarkus.kafka.client.serialization.ObjectMapperSerializer;

public class PersonSerializer extends ObjectMapperSerializer<Person> {

}
