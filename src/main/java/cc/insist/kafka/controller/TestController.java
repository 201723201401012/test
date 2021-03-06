package cc.insist.kafka.controller;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

/**
 * @description:
 * @author: cc
 * @time: 2021/2/2 8:10 下午
 */
@Controller
public class TestController {
    @Resource
    private KafkaTemplate<String, Object> kafkaTemplate;

    @GetMapping("/test/kafka")
    public void send(String msg) {
        System.out.println("dfsafdsafdsafsa");
        kafkaTemplate.send("test1", msg);
    }
}