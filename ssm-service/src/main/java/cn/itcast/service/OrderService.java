package cn.itcast.service;

import cn.itcast.domain.Order;

import java.util.List;

public interface OrderService {

    List<Order> findAllByPage(int currentPage, int pageSize);
}
