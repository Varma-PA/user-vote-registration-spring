package com.achyuth.vote.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.management.openmbean.OpenMBeanAttributeInfo;

/*
Referred from https://www.bezkoder.com/spring-boot-swagger-3/
 */

@Configuration
public class OpenAPIConfig{

    @Bean
    public OpenAPI myOpenAPI(){

        License mitLicense = new License().name("MIT License").url("https://choosealicense.com/licenses/mit/");

        Contact contact = new Contact();
        contact.setEmail("achyuth.varma1@gmail.com");
        contact.setName("Achyuth Varma");
        contact.setUrl("https://achyuthvarmap.com");

        Info info = new Info()
                .title("Voter Management Microservice")
                .version("1.0")
                .contact(contact)
                .description("This Microservices manages voters and their users")
                .license(mitLicense);

        return new OpenAPI().info(info);

    }

}
