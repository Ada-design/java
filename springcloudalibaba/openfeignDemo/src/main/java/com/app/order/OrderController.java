package com.app.order;

import com.app.feign.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private StockFeignService stockFeignService;

    @RequestMapping("/add/{id}")
    public String add(@PathVariable Integer id) {
        System.out.println("下单成功");
        return "Hello World" + stockFeignService.reduct(id);
    }
}
