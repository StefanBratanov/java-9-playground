package flow;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        MyPublisher publisher = new MyPublisher("HEY");
        MyPublisher publisher2 = new MyPublisher("HEY2");

        MySubscriber subscriber = new MySubscriber();

        publisher.subscribe(subscriber);
        publisher2.subscribe(subscriber);

        Stream.iterate(0, i -> i <= 2, i -> i + 1)
                .forEach(i -> {
                    publisher.publish();
                    publisher2.publish();
                });

    }
}
