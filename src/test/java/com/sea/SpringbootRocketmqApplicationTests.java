package com.sea;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRocketmqApplicationTests {

    @Autowired
    private DefaultMQProducer defaultMQProducer;


    @Test
    public void contextLoads() throws InterruptedException, RemotingException, MQClientException, MQBrokerException {
        String msg = "demo00099";
        Message message = new Message("DemoTopic2", "*", msg.getBytes());
        SendResult send = defaultMQProducer.send(message);
        System.out.println(send.toString());
    }

}
