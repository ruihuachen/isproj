package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.producer.IMessageProducerService;

@RestController
public class MainController {

    @Autowired
    private IMessageProducerService iMessageProducerService;

    @RequestMapping(value = "/")
    String home() {
        System.out.println("进入");
        return "hello World!";
    }

    /**
     * 测试ActiveMQ的运行
     */
    @RequestMapping("/TestActiveMQ")
    public void TestActiveMQ() {
        System.out.println("已进入....");
        for (int i=0; i<10; i++) {
            iMessageProducerService.sendMessage2("study - "+ i);
        }
    }


}
