package org.spring.web.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ServletConfiguration implements WebApplicationInitializer {

    @Override
    public void onStartup(jakarta.servlet.ServletContext servletContext) {

        var context = new AnnotationConfigWebApplicationContext();
        context.scan("org.spring.web");

        var dispatcherServlet = new DispatcherServlet(context);

        servletContext.addServlet("dispatcher", dispatcherServlet)
                .addMapping("/");

    }

}
