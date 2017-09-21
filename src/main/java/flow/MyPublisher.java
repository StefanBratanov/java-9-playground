package flow;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Flow;

class MyPublisher implements Flow.Publisher<String> {

    private final String message;

    private final List<Flow.Subscriber<? super String>> subscribers
            = new CopyOnWriteArrayList<>();

    MyPublisher(String message) {
        this.message = message;
    }

    @Override
    public void subscribe(Flow.Subscriber<? super String> subscriber) {
        subscribers.add(subscriber);
    }

    void publish() {
        subscribers.forEach((sub) -> sub.onNext(message));
    }

}
