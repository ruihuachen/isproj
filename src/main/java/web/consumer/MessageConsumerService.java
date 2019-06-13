package web.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumerService {

    //监听控制
//    @JmsListener(destination = "study.msg.queue")
    @JmsListener(destination = "chr")
    public void receiveMessage(String text) {    // 进行消息接收处理
        System.err.println("【*** 消费者1接收消息 ***】" + text);
    }
}
