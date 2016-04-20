package com.booking.date.config.serializer;

import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.ser.std.SerializerBase;

public class LocalTimeSerializer extends SerializerBase<LocalTime> {

    public static final String LOCAL_TIME_FORMAT = "hh:mm";

    public LocalTimeSerializer() {
        super(LocalTime.class);
    }

    @Override
    public void serialize(LocalTime value, JsonGenerator jgen, SerializerProvider provider)
            throws IOException, JsonGenerationException {
        jgen.writeString(value.format(DateTimeFormatter.ofPattern(LOCAL_TIME_FORMAT)));
    }
}