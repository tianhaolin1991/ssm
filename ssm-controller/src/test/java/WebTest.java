import cn.itcast.domain.Product;
import cn.itcast.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-controller.xml")
public class WebTest {
    @Autowired
    private ProductService productService;

    @Test
    public void test03() {
        List<Product> products = productService.findAll();
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
