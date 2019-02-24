package cn.itcast.service.impl;

import cn.itcast.dao.OrderDao;
import cn.itcast.domain.Order;
import cn.itcast.service.OrderService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Override
    public List<Order> findAllByPage(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        List<Order> orderList = orderDao.findAll();
        return orderList;
    }
}
