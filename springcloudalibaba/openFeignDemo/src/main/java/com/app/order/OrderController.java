package com.app.order;

import com.app.feign.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private StockFeignService stockFeignService;

    @RequestMapping("/add")
    public String add() {
        System.out.println("下单成功");
        return "Hello World" + stockFeignService.reduct(11);
    }
}
