package com.demo.Redis;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * Created by toutou on 2019/1/20.
 */
@Configuration
@EnableCaching
public class RedisCacheConfig {
    //@Bean
    //RedisMessageListenerContainer container(RedisConnectionFactory connectionFactory,
    //                                        MessageListenerAdapter listenerAdapter) {
    //
    //    RedisMessageListenerContainer container = new RedisMessageListenerContainer();
    //    container.setConnectionFactory(connectionFactory);
    //    container.addMessageListener(listenerAdapter, new PatternTopic("chat"));
    //
    //    return container;
    //}
    //
    //@Bean
    //MessageListenerAdapter listenerAdapter(Receiver receiver) {
    //    return new MessageListenerAdapter(receiver, "receiveMessage");
    //}
    //
    //@Bean
    //Receiver receiver(CountDownLatch latch) {
    //    return new Receiver(latch);
    //}
    //
    //@Bean
    //CountDownLatch latch() {
    //    return new CountDownLatch(1);
    //}
    //
    //@Bean
    //StringRedisTemplate template(RedisConnectionFactory connectionFactory) {
    //    return new StringRedisTemplate(connectionFactory);
    //}
    //
    //public class Receiver {
    //
    //
    //    private CountDownLatch latch;
    //
    //    @Autowired
    //    public Receiver(CountDownLatch latch) {
    //        this.latch = latch;
    //    }
    //
    //    public void receiveMessage(String message) {
    //        latch.countDown();
    //    }
    //}
}
