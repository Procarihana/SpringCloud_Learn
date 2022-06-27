package com.luwei.common.core.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.math.BigDecimal;

public class BigDecimalScaleOneSerialize extends JsonSerializer<BigDecimal> {

    @Override
    public void serialize(BigDecimal bigDecimal, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (bigDecimal != null && !"".equals(bigDecimal)) {
            jsonGenerator.writeString(bigDecimal.setScale(1, BigDecimal.ROUND_HALF_DOWN) + "");
        } else {
            jsonGenerator.writeString(null + "");
        }
    }
}
