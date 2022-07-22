package com.xxxx.seckill.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MQReceiver {
    @RabbitListener(queues = "queue")
    public void receive(Object msg) {
        log.info("receiving message:" + msg);
    }

    @RabbitListener(queues = "queue_fanout01")
    public void receive01(Object msg) {
        log.info("QUEUE01 receiving message:" + msg);
    }

    @RabbitListener(queues = "queue_fanout02")
    public void receive02(Object msg) {
        log.info("QUEUE02 receiving message:" + msg);
    }

    @RabbitListener(queues = "queue_direct01")
    public void receive03(Object msg) {
        log.info("QUEUE01 receiving message" + msg);
    }

    @RabbitListener(queues = "queue_direct02")
    public void receive04(Object msg) {
        log.info("QUEUE02 receiving message:" + msg);
    }

    @RabbitListener(queues = "queue_topic01")
    public void receive05(Object msg) {
        log.info("QUEUE01 receiving message:" + msg);
    }

    @RabbitListener(queues = "queue_topic02")
    public void receive06(Object msg) {
        log.info("QUEUE02 receiving message:" + msg);
    }

    @RabbitListener(queues = "queue_header01")
    public void receive07(Message message) {
        log.info("QUEUE01 receiving message:" + message);
        log.info("QUEUE01 receiving message" + new String(message.getBody()));
    }

    @RabbitListener(queues = "queue_header02")
    public void receive08(Message message) {
        log.info("QUEUE02 receiving message message:" + message);
        log.info("QUEUE02 receiving message" + new String(message.getBody()));
    }
}
