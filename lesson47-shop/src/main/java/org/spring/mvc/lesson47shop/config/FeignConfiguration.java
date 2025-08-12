package org.spring.mvc.lesson47shop.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.codec.ErrorDecoder;
import org.spring.mvc.lesson47shop.dto.ErrorDetailDto;
import org.spring.mvc.lesson47shop.exc.CommonException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration {

    @Bean
    public ErrorDecoder errorDecoder() {
        return (method, response) -> {

            try (var is = response.body().asInputStream()) {

                var errorAsBytes = is.readAllBytes();

                ObjectMapper mapper = new ObjectMapper();

                var errorDetails = mapper.readValue(errorAsBytes, ErrorDetailDto.class);

                return new CommonException(errorDetails);

            } catch (Exception e) {
            }

            return new CommonException(new ErrorDetailDto(808000, "Unknown error"));
        };
    }

}
