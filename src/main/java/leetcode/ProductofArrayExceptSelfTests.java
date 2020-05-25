package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/5/22.
 */
public class ProductofArrayExceptSelfTests {

    private static final Logger log = LogManager.getLogger(ProductofArrayExceptSelfTests.class);

    @Test
    public void test1() {
        int[] array = {1, 2, 3, 4};
        ProductofArrayExceptSelf productofArrayExceptSelf = new ProductofArrayExceptSelf();
        log.info(productofArrayExceptSelf.productExceptSelf(array));
    }
}

