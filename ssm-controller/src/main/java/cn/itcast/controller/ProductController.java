package cn.itcast.controller;

import cn.itcast.domain.Product;
import cn.itcast.exception.SysException;
import cn.itcast.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();
        List<Product> products = productService.findAll();
        for (Product product : products) {
            System.out.println(product);
        }
        modelAndView.addObject("products",products);
        modelAndView.setViewName("product-list");
        return modelAndView;
    }

    @RequestMapping("/toAdd")
    public String toAdd(){
        return "product-add";
    }
    @RequestMapping("/save")
    public String saveProduct(Product product){
        productService.save(product);
        return "forward:/product/findAll";
    }
}
