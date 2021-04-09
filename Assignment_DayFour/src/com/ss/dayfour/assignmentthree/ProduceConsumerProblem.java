package com.ss.dayfour.assignmentthree;

public class ProduceConsumerProblem {
    public static void main(String[] args) {
        Producer producer = new Producer();
        producer.start();

        Consumer consumer = new Consumer(producer);
        consumer.setName("Consumer 1");
        consumer.start();

        Consumer consumer1 = new Consumer(producer);
        consumer1.setName("Consumer 2");
        consumer1.start();

        Consumer consumer2 = new Consumer(producer);
        consumer2.setName("Consumer 3");
        consumer2.start();

    }
}