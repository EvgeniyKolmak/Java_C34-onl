package org.spring.web.config;

import jakarta.servlet.MultipartConfigElement;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ServletConfiguration implements WebApplicationInitializer {

    @Override
    public void onStartup(jakarta.servlet.ServletContext servletContext) {

        var context = new AnnotationConfigWebApplicationContext();
        context.scan("org.spring.web");

        var dispatcherServlet = new DispatcherServlet(context);

        var dispatcher = servletContext.addServlet("dispatcher", dispatcherServlet);

        var multipartConfigElement = new MultipartConfigElement("/tmp", 90*1024*1024, 2*90*1024*1024, 90*1024*1024/2);
        dispatcher.setMultipartConfig(multipartConfigElement);

        dispatcher
                .addMapping("/");

    }

}
