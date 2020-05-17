package org.ruixiao.kettle;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.UnsupportedEncodingException;

@SpringBootTest
class KettleApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void test() throws UnsupportedEncodingException {
        String log = "你好狗总";
        byte[] bytes = log.getBytes("UTF-8");
        System.out.println(new String(bytes));
    }
}
