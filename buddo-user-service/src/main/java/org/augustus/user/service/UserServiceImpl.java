package org.augustus.user.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
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
 * @date 2020/2/2 16:21
 */
@Component
@Service
public class UserServiceImpl implements UserService {

    @Reference(check = false)
    private OrderService orderService;

    @Override
    public List<ReceiveAddress> findUserInfo(Long aLong) {
        Stream<ReceiveAddress> stream = Stream.of(new ReceiveAddress(1L, "林永锦", "福建省福州市晋安区长春路前屿新村1座702"),
                new ReceiveAddress(2L, "林永锦", "福建省莆田市城厢区莆田学院凤达山庄"));
        return stream.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }

    @Override
    public List<Order> findOrderInfo(Long id) {
        return orderService.findOrderInfo(id);
    }
}
