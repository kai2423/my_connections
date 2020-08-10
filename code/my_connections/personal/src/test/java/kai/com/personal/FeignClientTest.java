package kai.com.personal;

import feignClient.UserSystemFeignClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import vo.LoginVo;

@SpringBootTest
@RunWith(SpringRunner.class)
public class FeignClientTest {

    @Autowired
    UserSystemFeignClient userSystemFeignClient;

    @Test
    public void test(){
        System.out.println(userSystemFeignClient.login(new LoginVo("P", "2423812575@qq.com", null, "123456",
                null)));
    }


}
