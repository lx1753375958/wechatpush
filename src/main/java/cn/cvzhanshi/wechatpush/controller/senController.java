package cn.cvzhanshi.wechatpush.controller;

import cn.cvzhanshi.wechatpush.config.Pusher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("send")
public class senController {
    @GetMapping()
    public void send() {
        Pusher.push();
    }
}
