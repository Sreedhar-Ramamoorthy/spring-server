package com.shell.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
//@EnableWebMvc
//@EnableSwagger2
public class EmployeeApplication extends SpringBootServletInitializer {
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(EmployeeApplication.class);
//    }
//    // Replace the embedded Tomcat server factory with Jetty server factory
//    @Bean
//    public ServletWebServerFactory servletContainer() {
//        return new JettyServletWebServerFactory();
//    }

    public static void main(String[] args) {
        SpringApplication.run(EmployeeApplication.class, args);
    }


}
