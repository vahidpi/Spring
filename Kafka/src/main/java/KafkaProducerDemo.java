import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class KafkaProducerDemo {
    public static void main(String[] args) {
        Properties properties = new Properties();

        // kafka bootstrap server
        properties.setProperty("bootstrap.servers", "127.0.0.1:9092");
        properties.setProperty("key.serializer", StringSerializer.class.getName());
        properties.setProperty("value.serializer", StringSerializer.class.getName());

        // producer acks
        properties.setProperty("acks", "1");
        properties.setProperty("retries", "3");
        properties.setProperty("Linger.ms","1");


        // producer object
        Producer<String,String> producer=new org.apache.kafka.clients.producer.KafkaProducer<String, String>(properties);

        ProducerRecord<String,String> producerRecord=new ProducerRecord<String, String>("thierdTopic", "3","other message test");

        producer.send(producerRecord);
        //producer.flush();

        producer.close();


        // topic name

    }
}
