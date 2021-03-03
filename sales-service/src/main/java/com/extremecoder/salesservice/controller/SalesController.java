package com.extremecoder.salesservice.controller;

import com.extremecoder.salesservice.model.Item;
import com.extremecoder.salesservice.model.MyOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@RestController
public class SalesController {

    private final RestTemplate restTemplate;

    public SalesController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/sales/get-order")
    public MyOrder getOrder() {
        Item item = restTemplate.getForObject("http://ITEM-SERVICE/item/500", Item.class);
        return new MyOrder(105, Collections.singletonList(item));
    }

    @GetMapping("/sales/check-item-request")
    public String checkItemRequest() {
        return restTemplate.getForObject("http://ITEM-SERVICE/item/get-instance", String.class);
    }

}
