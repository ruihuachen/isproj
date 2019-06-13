package web.producer.Impl;

import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;
import web.producer.IMessageProducerService;

import javax.annotation.Resource;
import javax.jms.Queue;
import javax.jms.Topic;

@Service
public class MessageProducerServiceImpl implements IMessageProducerService {

    @Resource
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Resource
    private Queue queue;

    @Resource
    private Topic topic;

    @Override
    public void sendMessage(String msg) {
        this.jmsMessagingTemplate.convertAndSend(this.queue, msg);
    }

    @Override
    public void sendMessage2(String msg) {
        this.jmsMessagingTemplate.convertAndSend(this.topic, msg);
    }
}
