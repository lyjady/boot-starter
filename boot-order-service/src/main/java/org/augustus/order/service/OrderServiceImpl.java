package org.augustus.order.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.augustus.bean.Order;
import org.augustus.bean.ReceiveAddress;
import org.augustus.service.OrderService;
import org.augustus.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author LinYongJin
 * @date 2020/2/2 18:30
 */
@Component
@Service
public class OrderServiceImpl implements OrderService {

    @Reference(check = false)
    private UserService userService;

    @Override
    public List<ReceiveAddress> initOrder(Long userId) {
        return userService.findUserInfo(userId);
    }

    @Override
    @HystrixCommand()
    public List<Order> findOrderInfo(Long userId) {
        if (Math.random() > 0.5) {
            throw new RuntimeException("");
        }
        Stream<Order> stream = Stream.of(new Order(1L, "RTX 2080 Ti", 9999D), new Order(2L, "i9-9900KS", 5000D));
        return stream.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }
}
