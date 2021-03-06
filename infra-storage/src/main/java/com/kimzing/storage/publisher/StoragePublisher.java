package com.kimzing.storage.publisher;

import com.kimzing.storage.domain.storage.StorageFileCreateEvent;
import com.kimzing.utils.log.LogUtil;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 文件上传相关信息发布.
 *
 * @author KimZing - kimzing@163.com
 * @since 2020/7/11 17:22
 */
@Component
public class StoragePublisher {

    @Resource
    RocketMQTemplate rocketMQTemplate;

    /**
     * 用户创建消息,演示异步消息发布
     */
    public void publishStorageFileCreateEvent(StorageFileCreateEvent storageFileCreateEvent) {
        rocketMQTemplate.asyncSend(StorageFileCreateEvent.TOPIC, storageFileCreateEvent,
                new SendCallback() {
                    @Override
                    public void onSuccess(SendResult sendResult) {
                        LogUtil.info("消息[{}]发送成功: [{}]", storageFileCreateEvent, sendResult);
                    }

                    @Override
                    public void onException(Throwable e) {
                        LogUtil.error("消息[{}]发送失败: [{}]", storageFileCreateEvent, e);
                    }
                });
    }

}
