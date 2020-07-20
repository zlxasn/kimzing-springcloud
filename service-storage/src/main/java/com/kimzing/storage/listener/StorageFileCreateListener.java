package com.kimzing.storage.listener;

import com.kimzing.storage.domain.storage.StorageFileCreateEvent;
import com.kimzing.storage.domain.storage.StorageFileSaveDTO;
import com.kimzing.storage.service.storage.StorageFileService;
import com.kimzing.utils.bean.BeanUtil;
import com.kimzing.utils.log.LogUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2020/7/11 23:26
 */
@Slf4j
@Component
@RocketMQMessageListener(topic = StorageFileCreateEvent.TOPIC, consumerGroup = "storage-file-create-group")
public class StorageFileCreateListener implements RocketMQListener<StorageFileCreateEvent> {

    @Reference
    StorageFileService storageFileService;

    @Override
    public void onMessage(StorageFileCreateEvent message) {
        LogUtil.info("保存上传文件信息:[{}]", message);

        StorageFileSaveDTO storageFileSaveDTO = BeanUtil.mapperBean(message, StorageFileSaveDTO.class);
        storageFileService.save(storageFileSaveDTO);
    }

}
