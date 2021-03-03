package com.extremecoder.itemservice.controller;

import com.extremecoder.itemservice.model.Item;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @Value("${eureka.instance.instance-id}")
    String instanceId;

    @GetMapping("/item/{id}")
    public Item getItem(@PathVariable("id") int id) {
        return new Item(500, "Banana");
    }

    @GetMapping("item/get-instance")
    public String getInstance() {
        return instanceId;
    }
}
