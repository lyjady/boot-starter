package org.augustus.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.augustus.bean.Order;
import org.augustus.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author LinYongJin
 * @date 2020/2/2 19:04
 */
@RestController
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/findOrder/{userId}")
    public List<Order> findOrder(@PathVariable("userId") Long userId) {
        return userService.findOrderInfo(userId);
    }
}
