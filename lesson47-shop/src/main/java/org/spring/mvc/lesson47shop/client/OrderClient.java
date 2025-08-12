package org.spring.mvc.lesson47shop.client;

import org.spring.mvc.lesson47shop.dto.OrderDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "order-client", url = "http://127.0.0.1:8083", path = "order")
public interface OrderClient {

    @PostMapping
    OrderDto save(@RequestBody OrderDto orderDto);

}
