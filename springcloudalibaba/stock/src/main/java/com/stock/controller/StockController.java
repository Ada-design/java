package com.stock.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/stock")
public class StockController {
    @RequestMapping("/reduct/{id}")
    public String reduct(@PathVariable Integer id) {
        System.out.println("扣减库存");
        return "扣减库存 " + id;
    }
}
