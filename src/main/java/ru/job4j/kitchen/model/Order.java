package ru.job4j.kitchen.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Order implements Serializable {
    private int id;
    private int dishId;
}
