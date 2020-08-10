package kai.com.personal.controller;

import feignClient.UserSystemFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vo.LoginVo;

@RestController
public class TestController {

    @Autowired
    UserSystemFeignClient userSystemFeignClient;

    @PostMapping("/test")
    public String test(@RequestBody LoginVo vo){
        return userSystemFeignClient.login(vo);
    }



}
