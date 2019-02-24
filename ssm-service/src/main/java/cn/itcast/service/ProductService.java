package cn.itcast.service;

import cn.itcast.domain.Product;

import java.util.List;

public interface ProductService {

    /**
     * 从商品库中查询所有
     */
    List<Product> findAll();

    /**
     *
     */
    void save(Product product);
}
