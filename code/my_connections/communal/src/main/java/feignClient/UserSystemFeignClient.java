package feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import vo.LoginVo;

@FeignClient(name = "user-system")
public interface UserSystemFeignClient {

    @PostMapping("/system/loginAndRegist/login")
    String login(@RequestBody LoginVo vo);

}
