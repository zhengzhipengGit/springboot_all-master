package com.kk.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class KafkaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaProviderApplication.class, args);
    }

}
