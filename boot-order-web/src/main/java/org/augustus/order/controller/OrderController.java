package org.augustus.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.augustus.bean.ReceiveAddress;
import org.augustus.service.OrderService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author LinYongJin
 * @date 2020/2/2 18:39
 */
@RestController
public class OrderController {

    @Reference
    private OrderService orderService;

    @RequestMapping("/receiveAddresses/{userId}")
    public List<ReceiveAddress> receiveAddresses(@PathVariable("userId") Long userId) {
        return orderService.initOrder(userId);
    }
}
