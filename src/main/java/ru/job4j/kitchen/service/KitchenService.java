package ru.job4j.kitchen.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.job4j.kitchen.model.Order;
import ru.job4j.kitchen.repository.KitchenRepository;

@Service
@Slf4j
public class KitchenService {

    private KitchenRepository repository;

    @KafkaListener(topics = "preorder")
    public void receiveOrder(Order order) {
        log.debug(order.toString());
        repository.save(order);
    }
}
