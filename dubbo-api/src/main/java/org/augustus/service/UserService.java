package org.augustus.service;

import org.augustus.bean.Order;
import org.augustus.bean.ReceiveAddress;

import java.util.List;

/**
 * @author LinYongJin
 * @date 2020/2/2 16:11
 */
public interface UserService {

    List<ReceiveAddress> findUserInfo(Long id);

    List<Order> findOrderInfo(Long id);
}
