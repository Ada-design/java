package com.app.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * name指定调用rest接口对应的服务名
 * path指定调用rest接口所在的StockController指定的@RequestMapping
 * 2.添加Feign接口和方法
 */

@FeignClient(name = "stock-service", path = "/stock",url = "http://localhost:9090")
public interface StockFeignService {
    // 声明需要调用的rest接口对应的方法,rest接口方法什么样子，feign这里声明的方法和它一样(包括参数)
    @RequestMapping("/reduct/{id}")
    String reduct(@PathVariable Integer id);
}

//package com.stock.controller;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/stock")
//public class StockController {
//    @RequestMapping("/reduct")
//    public String reduct() {
//        System.out.println("扣减库存");
//        return "扣减库存";
//    }
//}
