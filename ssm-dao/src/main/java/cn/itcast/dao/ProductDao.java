package cn.itcast.dao;

import cn.itcast.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("productDao")
public interface ProductDao {

    @Select("SELECT * FROM PRODUCT")
    List<Product> findAll();

    void save(Product product);
}
