package cn.itcast.controller;

import cn.itcast.domain.Order;
import cn.itcast.service.OrderService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/findAllByPage")
    public ModelAndView findAllByPage(int currentPage, int pageSize) {
        List<Order> orderList = orderService.findAllByPage(currentPage, pageSize);
        ModelAndView modelAndView = new ModelAndView();
        PageInfo<Order> pageInfo = new PageInfo<>(orderList);
        modelAndView.addObject("orderList", pageInfo);
        modelAndView.setViewName("orders-list");
        return modelAndView;
    }
}
