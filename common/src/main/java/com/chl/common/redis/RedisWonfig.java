package com.chl.common.redis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/4/7 13:14
 */
@Configuration
public class RedisWonfig {


//    private String listenChannelStr = null;
//    @Value("system.redis.listen.channels")
//    public void setListenChannelStr(String listenChannelStr){
//        this.listenChannelStr=listenChannelStr;
//    }
//
//    /**
//     * redis消息监听器容器
//     * 可以添加多个监听不同话题的redis监听器，只需要把消息监听器和相应的消息订阅处理器绑定，该消息监听器
//     * 通过反射技术调用消息订阅处理器的相关方法进行一些业务处理
//     * @param connectionFactory
//     * @param listenerAdapter
//     * @return
//     */
//    @Bean
//    RedisMessageListenerContainer container(RedisConnectionFactory connectionFactory,MessageListenerAdapter listenerAdapter) {
//        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
//        container.setConnectionFactory(connectionFactory);
//
//        //可以添加多个 messageListener
//        container.addMessageListener(listenerAdapter, new PatternTopic("index"));
//
//
//        return container;
//    }
//
//    /**
//     * 消息监听器适配器，绑定消息处理器，利用反射技术调用消息处理器的业务方法
//     * @param redisReceiver
//     * @return
//     */
//    @Bean
//    MessageListenerAdapter listenerAdapter(RedisReceiver redisReceiver) {
//        System.out.println("消息适配器进来了");
//        return new MessageListenerAdapter(redisReceiver, "receiveMessage");
//    }
//
//
//    //使用默认的工厂初始化redis操作模板
//    @Bean
//    StringRedisTemplate template(RedisConnectionFactory connectionFactory) {
//        return new StringRedisTemplate(connectionFactory);
//    }


}
