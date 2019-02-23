import cn.itcast.dao.ProductDao;
import cn.itcast.domain.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-dao.xml")
public class DaoTest {
    @Autowired
    private ProductDao productDao;
    @Test
    public void test01(){
        List<Product> products = productDao.findAll();
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
