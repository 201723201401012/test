package cc.insist.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: cc
 * @time: 2021/2/2 8:11 下午
 */
@Component
public class TestKafkaListener {
    @KafkaListener(id = "c_1", topicPartitions = {@TopicPartition(topic = "test1", partitionOffsets = @PartitionOffset(partition = "0", initialOffset = "0"))})
    public void partition0(String msgData) {
        System.out.println("demo3 receive : " + msgData + ", partition: 0" );
    }

    @KafkaListener(id = "c2", topicPartitions = {@TopicPartition(topic = "test1", partitionOffsets = @PartitionOffset(partition = "1", initialOffset = "0"))})
    public void partition1(String msgData) {
        System.out.println("demo3 receive : " + msgData + ", partition: 1" );
    }

    @KafkaListener(id = "c3", topicPartitions = {@TopicPartition(topic = "test1", partitionOffsets = @PartitionOffset(partition = "2", initialOffset = "0"))})
    public void listenPartitionOnly(String msgData) {
        System.out.println("demo3 receive : " + msgData + ", partition: 2" );
    }
}