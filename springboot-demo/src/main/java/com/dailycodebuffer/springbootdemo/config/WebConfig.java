package com.dailycodebuffer.springbootdemo.config;

import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {
    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        /*
        configurer.favorParameter(true)
                .parameterName("mediaType")
                .defaultContentType("json", MediaType.APPLICATION_JSON)
                .defaultContentType("xml",MediaType.APPLICATION_XML_VALUE)
        WebMvcConfigurer.super.configureContentNegotiation(configurer);*/
    }
}
