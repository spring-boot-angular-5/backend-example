package com.example.demo;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {

    @Autowired
    public WebConfiguration(ObjectMapper objectMapper) {
        objectMapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
    }

}
