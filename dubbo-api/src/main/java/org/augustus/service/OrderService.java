package org.augustus.service;

import org.augustus.bean.Order;
import org.augustus.bean.ReceiveAddress;

import java.util.List;

/**
 * @author LinYongJin
 * @date 2020/2/2 16:09
 */
public interface OrderService {

    List<ReceiveAddress> initOrder(Long userId);

    List<Order> findOrderInfo(Long userId);
}
