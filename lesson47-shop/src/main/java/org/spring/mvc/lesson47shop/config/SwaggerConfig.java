package org.spring.mvc.lesson47shop.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .version("0.9")
                        .summary("OpenApi Shop Summery")
                        .description("OpenApi Shop Description")
                        .title("OpenApi Shop Title"));
    }

    @Bean
    public GroupedOpenApi groupedOpenApiPerson() {
        return GroupedOpenApi.builder()
                .group("PERSON GROUP")
                .displayName("PERSON GROUP DN")
                .pathsToMatch("/person/**")
                .build();
    }

    @Bean
    public GroupedOpenApi groupedOpenApiTool() {
        return GroupedOpenApi.builder()
                .group("TOOL GROUP")
                .displayName("TOOL GROUP DN")
                .pathsToMatch("/tool/**")
                .build();
    }

    @Bean
    public GroupedOpenApi groupedOpenApiOrder() {
        return GroupedOpenApi.builder()
                .group("ORDER GROUP")
                .displayName("ORDER GROUP DN")
                .pathsToMatch("/order/**")
                .build();
    }

}
