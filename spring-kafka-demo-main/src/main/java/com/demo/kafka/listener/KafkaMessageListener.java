package com.demo.kafka.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.listener.MessageListener;

/**
 * @author hengjian
 * @date 2019/2/20
 */
public class KafkaMessageListener implements MessageListener<String, String> {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaMessageListener.class);

    public void onMessage(ConsumerRecord<String, String> consumerRecord) {
        LOGGER.info("JdqMessageListener start-->ConsumerRecord:{}");
    }
}