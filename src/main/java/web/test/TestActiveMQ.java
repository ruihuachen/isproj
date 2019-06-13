package web.test;

import web.producer.IMessageProducerService;

import javax.annotation.Resource;

public class TestActiveMQ {

    @Resource
    private IMessageProducerService messageProducerService;

    public void testSend() {
        for (int i =0; i<10; i++) {
            this.messageProducerService.sendMessage("study - "+ i);
        }
    }
}
